package chapter2.innerclasses;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: TopLevelOuter
 * Date: 2017-03-23
 * Time: 오후 5:14
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TopLevelOuter {
    private int v1 = 100;

    public class InnerLevelOne {
        private int v2 = 200;

        public class InnerLevelTwo {
            private int v3 = 300;

            public class InnerLevelThere {
                private int v4 = 400;

            }
        }
    }
}
