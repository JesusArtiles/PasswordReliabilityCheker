import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import PasswordReliabilityCheck.*;


public class PasswordReliabilityCheckShould {
    @Test
    public void return_false_if_shorter_than_6_characters(){
        Boolean result = new PasswordReliabilityCheck().apply("12345");
        assertThat(result).isFalse();
    }

}
