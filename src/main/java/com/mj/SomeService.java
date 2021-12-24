package com.mj;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(scopeName = "prototype")
public class SomeService {
    public SomeService() {
        System.out.println("New Object created");
    }
}
