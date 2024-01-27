package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
        /* 필기. Date형 대비 개선점
         *       1. timezone과 관련된 기능이 추가 되었다.
         *       2. 윤년 관련 기능이 내부적으로 추가되었다.
         *       3. 날짜 및 시간 필드개념을 추가해 불필요한 메소드명을 줄였다.
        * */

        /* 설명. Calendar 자료형은 생성자를 통해 객체를 생성할 수 없다. */
        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        Calendar cal2 = new GregorianCalendar();              // 윤년의 개념을 정리한 그레고뤼~
        System.out.println("cal2 = " + cal2);

        int year = 1999;
        int month = 8;                                        // 인덱스 체계를 가지고 있어 개발자는 9월생은 (9-1)로 넣어야 함
        int dayofMonth = 2;
        int hour = 7;
        int min = 30;
        int second = 0;

        Calendar birthday = new GregorianCalendar(year, month, dayofMonth, hour, min, second);
        System.out.println(birthday);

        /* 설명. GregorianCalendar 객체가 가진 값 확인 */
        System.out.println("태어난 해: " + birthday.get(1));
        System.out.println("태어난 해: " + birthday.get(Calendar.YEAR));

        System.out.println("태어난 월: " + (birthday.get(2) + 1));
        System.out.println("태어난 월: " + (birthday.get(Calendar.MARCH) + 1));      // get() 메소드로 반환받은 값에 +1을 해줘야 우리가 생각하는 월의 개념이 됨

        System.out.println("태어난 일: " + birthday.get(5));
        System.out.println("태어난 일: " + birthday.get(Calendar.DAY_OF_MONTH));

        /* 설명. 요일에 대해 알아보자. */
        String day = "";
        switch (birthday.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY: day = "일"; break;
            case Calendar.MONDAY: day = "월"; break;
            case Calendar.TUESDAY: day = "화"; break;
            case Calendar.WEDNESDAY: day = "수"; break;
            case Calendar.THURSDAY: day = "목"; break;
            case Calendar.FRIDAY: day = "금"; break;
            case Calendar.SATURDAY: day = "토";
         }
        System.out.println("내 생일은 " + day + "요일이야!");

        /* 설명. 하나씩 불러와 보자. */
        System.out.println("AM/PM: " + birthday.get(Calendar.AM_PM));            // 0은 오전, 1은 오후
        System.out.println("hourOfDay: " + birthday.get(Calendar.HOUR_OF_DAY));  // 24시간 체계
        System.out.println("hour: " + birthday.get(Calendar.HOUR));              // 12시간 체계
        System.out.println("min: " + birthday.get(Calendar.MINUTE));
        System.out.println("sec: " + birthday.get(Calendar.SECOND));

        /* 설명. SimpleDateFormat 활용하기(feat. java.util.Date형으로 변환 후 활용) */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");
        String birthDayString = sdf.format(new java.util.Date(birthday.getTimeInMillis()));
        System.out.println("birthDayString = " + birthDayString);

    }
}
