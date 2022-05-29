package org.codej.labs;

import java.util.Arrays;

public class ArraysCopy {
    //얕은 복사 : 같은 메모리를 공유
    //깊은 복사 : 각각 독립적인 메모리를 가진다.

    //알아야 하는 이유 : 기본의타입의 변수는 얕은 복사로도 가능하지만, 참조타입의 변수의 경우 깊은 복사를 사용해야 객체의 실제 데이터를 복사할 수 있다.

    //Arrays.copyOf(원본배열,복사할 길이)
    //Arrays.copyOfRange(원본 배열, 복사할 시작인덱스,복사할 끝 인덱스) : 깊은 복사
    public static void main(String[] args) {
        int[]arr = new int[]{12,34,56,78,90};
        int[] shallow_copy = arr;

        System.out.println("변수가 가리키는 메모리 : "+arr + " "+shallow_copy);
        System.out.println();
        System.out.println("1.얕은복사만 진행");
        System.out.println("==========");
        System.out.println("arr의 요소"+ Arrays.toString(arr));
        System.out.println("얕은복사의 요소 : "+Arrays.toString(shallow_copy));

        shallow_copy[0]=100;

        System.out.println("\n\n\n");
        System.out.println("2.얕은복사가 진행된 배열의 값 변경");
        System.out.println("=======");
        System.out.println("arr의 요소"+Arrays.toString(arr));
        System.out.println("얕은 복사의 요소 : "+Arrays.toString(shallow_copy));

        //깊은복사
        int[]deepArr = new int[]{10,20,30,40,50,60};
        int[]deep_copy = Arrays.copyOf(deepArr,deepArr.length);
        System.out.println("* 변수가 가리키는 메모리 : " + arr + " " + deep_copy);
        System.out.println();
        System.out.println("1. deep_copy만 진행");
        System.out.println("----------------------------------------");
        System.out.println("deepArr의 요소 : " + Arrays.toString(arr));
        System.out.println("deep_copy의 요소 : " + Arrays.toString(deep_copy));

        deep_copy[0] = 100;

        System.out.println("\n\n\n");
        System.out.println("2. deep_copy가 진행된 배열의 값 변경 (deepArr의 값이 변경되도 아래 결과는 동일하다.)");
        System.out.println("----------------------------------------");
        System.out.println("deepArr의 요소 : " + Arrays.toString(deepArr));
        System.out.println("deep_copy의 요소 : " + Arrays.toString(deep_copy));

        System.out.println("=============");
        int[] deepOfArr = new int[] {10,20,30,40,50};
        int[] deepOf_copy = Arrays.copyOfRange(deepOfArr, 0, 3);

        System.out.println("* 변수가 가리키는 메모리 : " + deepOfArr + " " + deepOf_copy);
        System.out.println("\n");
        System.out.println("1. deep_copy만 진행");
        System.out.println("----------------------------------------");
        System.out.println("deepOfArr의 요소 : " + Arrays.toString(deepOfArr));
        System.out.println("deepOf_copy 요소 : " + Arrays.toString(deepOf_copy));

        deepOf_copy[0] = 100;

        System.out.println("\n\n\n");
        System.out.println("2. deep_copy가 진행된 배열의 값 변경 (deepOfArr 값이 변경되도 아래 결과는 동일하다.)");
        System.out.println("----------------------------------------");
        System.out.println("deepOfArr 요소 : " + Arrays.toString(deepOfArr));
        System.out.println("deepOf_copy 요소 : " + Arrays.toString(deepOf_copy));
    }
}
