package com.an.antry.ldap;

import java.util.List;

public class LdapMain {
    public static void main(String[] args) {
        {
            PersonRepo repo = new TraditionalPersonRepoImpl();
            List<String> names = repo.getAllPersonNames();
            for (String name : names) {
                System.out.println(name);
            }
        }
        {
//            PersonRepo repo = new PersonRepoImpl();
//            List<String> names = repo.getAllPersonNames();
//            for (String name : names) {
//                System.out.println(name);
//            }
        }
    }
}
