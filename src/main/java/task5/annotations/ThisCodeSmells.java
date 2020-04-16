package task5.annotations;

import java.lang.annotation.*;

@Repeatable(Reviewers.class)
public @interface ThisCodeSmells {
    String reviewer();
}
