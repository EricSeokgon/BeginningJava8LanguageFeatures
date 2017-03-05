package chapter1.annotation;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: Review
 * Date: 2017-03-06
 * Time: 오전 8:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public @interface Review {
    ReviewStatus status() default ReviewStatus.PENDING;
    String comments() default "";
    // ReviewStatus enum is a member of the Review annotation type
    public enum ReviewStatus {PENDING, FAILED, PASSED, PASSEDWITHCHANGES}
}
