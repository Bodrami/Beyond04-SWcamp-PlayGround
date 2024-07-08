package com.ohgiraffers.section02.annotation.subsection04.resource;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceResource")
public class PokemonService {

    /* 설명. @Qualifer와 마찬가지로 @Primary보다 우선순위 높게 우리가 원하는 빈 이름(id)으로 하나의 빈을
     *      주입받을 수 있다.
    * */
//    @Resource(name = "charmander")
//    private Pokemon pokemon;
//
//    public void pokemonAttack() {
//        pokemon.attack();
//    }

    @Resource           // 빈 모두 받아보기
//    private List<Pokemon> pokemonList;

    private Map<String, Pokemon> pokemonMap;

    public void pokemonAttack() {
        pokemonMap.forEach((k, v) -> {
            System.out.println("key: " + k);
            System.out.println("value: " + v);
            v.attack();
        });
    }
}
