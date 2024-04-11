package com.ohgiraffers.bootproject.service;

import com.ohgiraffers.bootproject.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {        // ctrl + shift + t => test 클래스 자동 생성

    public int plus(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }
}
