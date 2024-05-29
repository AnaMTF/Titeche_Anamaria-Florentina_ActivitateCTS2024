package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.dubluri.TesteCuFake;

@RunWith(Categories.class)
@Suite.SuiteClasses(SuitaCompleta.class)
@Categories.IncludeCategory(TesteCuFake.class)
public class SuitaCustom {
}
