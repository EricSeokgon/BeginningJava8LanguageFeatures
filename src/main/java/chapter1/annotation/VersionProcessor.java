package chapter1.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.*;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * Project: BeginningJava8LanguageFeatures
 * FileName: VersionProcessor
 * Date: 2017-03-14
 * Time: 오전 9:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class VersionProcessor extends AbstractProcessor {
    public VersionProcessor() {

    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // Process all annotations
        for (TypeElement currentAnnotation : annotations) {
            javax.lang.model.element.Name qualifiedName = currentAnnotation.getQualifiedName();
// check if it is a Version annotation
            if (qualifiedName.contentEquals("chapter1.annotation.Version")) {
// Look at all elements that have Version annotations
                Set<? extends Element> annotatedElements;
                annotatedElements = roundEnv.getElementsAnnotatedWith(
                        currentAnnotation);
                for (Element element : annotatedElements) {
                    Version v = element.getAnnotation(Version.class);
                    int major = v.major();
                    int minor = v.minor();
                    if (major < 0 || minor < 0) {
// Print the error message
                        String errorMsg = "Version cannot" +
                                " be negative." +
                                " major=" + major +
                                " minor=" + minor;
                        Messager messager =
                                this.processingEnv.getMessager();
                        messager.printMessage(Diagnostic.Kind.ERROR,
                                errorMsg, element);
                    }
                }
            }
        }
        return true;
    }
}
