package org.codej.labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReplace {
    public static void main(String[] args) throws IOException {
        //repalce와 replaceAll의 차이

        while(true){
            String str = "로그인 target";
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("id써");
            String id = reader.readLine();
            System.out.println("pw써");
            String pwd = reader.readLine();

            if ((id.equals("jyyoun1022") && (pwd.equals("yjy^^46232891")))) {
                str = str.replace("target","성공");
                System.out.println(str);
                break;
            }else {
                 str = str.replaceAll("target", "실패");
                System.out.println(str);
                System.out.println("========종료=======");

            }

        }
    }
}
