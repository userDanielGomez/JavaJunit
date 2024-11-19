import org.junit.*;

public class MetodosManuales {

    @Before
    public void setUp(){
        System.out.println("Se ejecuta Antes de cada test");
    }

    @After
    public void tearDown(){
        System.out.println("Se ejecuta Despues de cada test");
    }

    @BeforeClass
    public static void SetUpClass(){
        System.out.println("Se ejecuta Antes de todos los test");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("Se ejecuta Despues de todos los test");
    }

    @Test
    public void primerTest(){
        System.out.println("Se ejecuta Primer Test");
    }

    @Test
    public void SegundoTest(){
        System.out.println("Se ejecuta Segundo Test");
    }



}
