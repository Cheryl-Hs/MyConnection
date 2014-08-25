/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yang
 */
public class Test {
 
    public static void main(String[] args){
        String jsonStr = "[{'name':"+"'hello','id'':123'},";
        
        for(int i=0;i<3;i++){
            jsonStr +="{'name':'"+ "name" + i + "','id':"+ i + "},";
        }
        jsonStr = jsonStr.substring(0,jsonStr.length()-1);
        jsonStr +="]";
        System.out.println(jsonStr);
        
        String[] arr = jsonStr.split("\\{");
        for(int i=0;i<arr.length;i++){
           String[] val = arr[i].split("\\}");
           System.out.println(val[0]);
            String[] val2 = val[0].split(",");
            for(int j=0;j<val2.length;j++)
                System.out.print(val2[j] + "|||");
            System.out.println();
        }
        
        
    }
}
