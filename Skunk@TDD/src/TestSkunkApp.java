import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSkunkApp {
		private SkunkApp game;
	@Before
      public void setup(){
    	  game=new SkunkApp();
      }


	@Test
	public void canCallGetPlayerInfo(){
		
		game.getPlayerInfo();
	}

}
