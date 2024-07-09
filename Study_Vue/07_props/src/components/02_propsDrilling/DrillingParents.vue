<template>
    <div class="container">
        <h1>Parents: {{ count }}</h1>
        <Child/>
    </div>
</template>

<script setup>
    import {provide, ref, readonly} from 'vue';
    import Child from './DrillingChild.vue';

    const count =ref(0);
    provide('count', count);    // provide를 통해 별도의 공간에 count 반응형 변수 값을 'count'라는 이름으로 담아 둠
    provide('count', readonly(count));  // providef를 활용하는 부모 컴포넌트에서는 수정하지만 inject를 활용하는 것은 읽기 전용으로 

</script>

<style scoped>
    .container{
        border: 1px solid black;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
</style>