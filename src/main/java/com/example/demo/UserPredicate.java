/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import com.querydsl.core.types.Predicate;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

/**
 *
 * @author binod
 */
public class UserPredicate {
    private UserPredicate(){}
   public static Predicate hasFirstName(String firstName){
       return QUser.user.firstName.eq(firstName);
   }
    
    
}
