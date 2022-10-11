package main;

import org.junit.Test;
import org.assertj.core.api.Assertions;
public class VerifyTest {

    @Test
    public void testRoger(){
        Verify verify = new Verify();
        boolean test=verify.verify("roger", "abrjdogkeer");
        Assertions.assertThat(test).isEqualTo(true);
    }
    @Test
    public void testEstRetenu(){
        Verify verify = new Verify();
        boolean test=verify.verify("est retenu", "tsetunere");
        Assertions.assertThat(test).isEqualTo(true);
    }
    @Test
    public void testJeLeBute(){
        Verify verify = new Verify();
        boolean test=verify.verify("je le bute", "effjelqou");
        Assertions.assertThat(test).isEqualTo(false);
    }

}
