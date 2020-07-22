import org.junit.*;



public class testclass {
    interfacee funcall;
    @Before
    public void initlize(){
        funcall = new functionsss() ;
        System.out.println("before");
    }
    @After
    public void Afterech(){
        System.out.println("after");
    }
    @Test
    public void checkprimenotest(){
        int chechprime = 5;
        Boolean res = false;
        res = funcall.checkprimeno(chechprime);
        boolean exp = true;
        Assert.assertSame(exp,res);
    }
    @Test
    public void checkevenoddtest(){
        int evenodd= 6;
        Boolean res = false;
        res = funcall.checkecevnodd(evenodd);
        boolean exp = true;
        Assert.assertSame(exp,res);
    }
    @Test
    public void getavtest(){
        int[] aar = {2,2};
        int res ;
        res = funcall.getavgerage(aar);
        int exp = 2;
        Assert.assertSame(exp,res);
    }
    @Test
    public void isPalindrometest(){
        String str = "akka";
        Boolean res = false;
        res = funcall.isPalindrome(str);
        boolean exp = true;
        Assert.assertSame(exp,res);
    }
    @Test
    public void ctoftest(){
        int c =2;
        int res  = 0;
        res = (int) Math.round(funcall.ictof(c));
        int  exp = (int) Math.round(35.6);
        Assert.assertSame(exp,res);
    }
    @Test
    public void ctoktest(){
        int c =2;
        int res  = 0;
        res = (int) Math.round(funcall.ictok(c));
        int  exp = (int) Math.round(275.15);
        Assert.assertSame(exp,res);
    }


}
