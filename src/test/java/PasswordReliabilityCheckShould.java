import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import PasswordReliabilityCheck.*;


public class PasswordReliabilityCheckShould {

    PasswordReliabilityCheck checker;

    @Before
    public void setup(){
        checker = new PasswordReliabilityCheck();
    }

    @Test
    public void return_false_if_shorter_than_6_characters(){
        Boolean result = checker.apply("12345");
        assertThat(result).isFalse();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_number(){
        Boolean result = checker.apply("HelloWorld_");
        assertThat(result).isFalse();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_upperCase(){
        Boolean result = checker.apply("helloworld_1");
        assertThat(result).isFalse();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_lowerCase(){
        Boolean result = checker.apply("HELLOWORLD_1");
        assertThat(result).isFalse();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_underscore(){
        Boolean result = checker.apply("HelloWorld1");
        assertThat(result).isFalse();
    }

    @Test
    public void return_true_if_password_contains_all_expected_digits(){
        Boolean result = checker.apply("Correct_Password01");
        assertThat(result).isTrue();
    }

}
