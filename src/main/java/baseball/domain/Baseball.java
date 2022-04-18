package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
    private List<Integer> computer;
    private List<Integer> user;

    public List<Integer>  getComputer() {
        return this.computer;
    }

    public void setComputer(String num) {
        List<Integer> tempComputer = new ArrayList<>();
        tempComputer.add(Character.getNumericValue(num.charAt(0)));
        tempComputer.add(Character.getNumericValue(num.charAt(1)));
        tempComputer.add(Character.getNumericValue(num.charAt(2)));
        this.computer = tempComputer;
    }

    public List<Integer> getUser() {
        return this.user;
    }

    public void setUser(String num) {
        List<Integer> tempUser = new ArrayList<>();
        tempUser.add(Character.getNumericValue(num.charAt(0)));
        tempUser.add(Character.getNumericValue(num.charAt(1)));
        tempUser.add(Character.getNumericValue(num.charAt(2)));
        this.user = tempUser;
    }
}
