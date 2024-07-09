import {createRouter, createWebHashHistory, createWebHistory} from 'vue-router';
import HomeView from '@/views/01_router/HomeView.vue';
import PathVariable from '@/views/01_router/PathVariable.vue';
import QueryString from '@/views/01_router/QueryString.vue';

const router = createRouter({
    
    // router 객체생성
    // history: createWebHashHistory(),
    history: createWebHistory(),    /* 이 코드를 사용하면 url에 #가 포함되지 않도록 해준다. */
    routes: [
        {
            path: '/',
            component: HomeView
        },
        {
            path: '/pathvariable/:id',
            component: PathVariable
        }
        ,{
            path: '/querystring',
            component: QueryString
        }
        
    ]
});

/* 화면과 연결이 되지 않아 찾은 코드누락 /router 객체를 export함(main.jsdptj import 할 용도) */
export default router;