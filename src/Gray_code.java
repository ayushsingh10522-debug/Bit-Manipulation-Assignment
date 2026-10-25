import java.util.List;
import java.util.ArrayList;

public class Gray_code {
    public List<Integer> grayCode(int n) {
        int totalNumbers = 1 << n;
        List<Integer> result = new ArrayList<>(totalNumbers);
        for(int i = 0; i < totalNumbers; i++)
            result.add(i ^ (i >> 1));
        return result;
    }
}
