import java.util.ArrayList;
import java.util.function.Consumer;

public class ExtendedArrayList extends ArrayList
{
   public void map (Command c)
   {
      for (Object data: this) {
         c.execute(data);
      }
   }
}
