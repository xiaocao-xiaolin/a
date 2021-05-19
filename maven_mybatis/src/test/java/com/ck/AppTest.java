package com.ck;

import static org.junit.Assert.assertTrue;

import com.ck.dao.IStudentDao;
import com.ck.dao.impl.IStudentDaoImpl;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void test1() {
        int c[] = {9,4,57,61,7,8};
        int temp = 0;
        for (int i = 0;i < c.length-1;i++){
            for (int j = i+1;j<c.length;j++){
                if (c[i]<c[j]){
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
    @Test
    public void test2() {
        System.out.println("5"+1);
    }
    @Test
    public void test3() {
        int arr[] = {4,2,6,7,1,3};
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    public void test4(){
        String a = "a.b.c";
        System.out.println(a.replace(".","/"));
    }
}
