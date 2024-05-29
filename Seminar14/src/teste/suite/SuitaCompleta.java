package teste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({teste.PersoanaTests.class, teste.PachetTuristicTest.class, teste.PachetTuristicTestWithFixture.class})
public class SuitaCompleta {
}
