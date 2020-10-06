import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import PasswordReliabilityCheck.*;


public class PasswordReliabilityCheckShould {
    @Test
    public void return_false_if_shorter_than_6_characters(){
        Boolean result = new PasswordReliabilityCheck().apply("12345");
        assertThat(result).isFalse();
    }

    @Test
    public void return_true_if_at_least_6_characters(){
        Boolean result = new PasswordReliabilityCheck().apply("Hello123");
        assertThat(result).isTrue();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_number(){
        Boolean result = new PasswordReliabilityCheck().apply("HelloWorld");
        assertThat(result).isFalse();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_upperCase(){
        Boolean result = new PasswordReliabilityCheck().apply("helloworld1");
        assertThat(result).isFalse();
    }

    @Test
    public void return_false_if_password_does_not_contain_any_lowerCase(){
        Boolean result = new PasswordReliabilityCheck().apply("HELLOWORLD1");
        assertThat(result).isFalse();
    }

}
