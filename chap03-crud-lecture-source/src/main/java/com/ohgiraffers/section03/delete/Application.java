package com.ohgiraffers.section03.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.*;

public class Application {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        /* 설명. soft delete - DB에 있는 속성값만 변경하기 때문에 ORDERABLE_STATUS 값을 N으로 바꾸어 준다.(update) */
//        String query1 = "UPDATE TBL_MENU SET ORDERABLE_STATUS = 'N' WHERE MENU_CODE = ?";

        /* 설명. hard delete - DB에 있는 속성값을 아예 삭제 처리 해버린다.(delete) */
        String query2 = "DELETE FROM TBL_MENU WHERE MENU_CODE = ?";

        try {
            pstmt = con.prepareStatement(query2);
            pstmt.setInt(1, 23);

            result = pstmt.executeUpdate();

            if(result > 0) {
                commit(con);
            } else {
                rollback(con);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
            close(con);
        }

        System.out.println("result = " + result);
    }
}