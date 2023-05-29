package com.virtualpantry.virtualpantry.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return true;
    }

    @Override
    public Predicate<String> and(Predicate<? super String> other) {
        return Predicate.super.and(other);
    }

    @Override
    public Predicate<String> negate() {
        return Predicate.super.negate();
    }

    @Override
    public Predicate<String> or(Predicate<? super String> other) {
        return Predicate.super.or(other);
    }
}
