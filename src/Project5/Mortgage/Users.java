package Project5.Mortgage;

public class Users {


    /*

        User Class, HousePrices Class ının ebeveyn classidir.

        her bir User in almasi gereken attribute lar private olmalıdır ve su sekildedir:

        String olanlar -> username, whichCondtiton, houseType
        int olanlar -> roomCount, downPayment, longTerm

        ve son olarakta StatesTax cinsinden bir StatesTax olmalıdır:

        "private StatexTax statesTax;"


     */

    private String username;
    private String whichCondition;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int lobgTerm;
    private StatesTax statesTax;




    /*

        Bir constructor methodu oluşturup, tüm attribute lar constructorda gelmeli ve daha sonra sınıfın kendi attributelarına
    eşitlenmelidir.

     */

    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int lobgTerm, StatesTax statesTax) {
        this.username = username;
        this.whichCondition = whichCondition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.lobgTerm = lobgTerm;
        this.statesTax = statesTax;
    }


// Son olarak ise tüm attributelar icin sadece getter methodlar oluşmalıdır.

    public String getUsername() {
        return username;
    }

    public String getWhichCondition() {
        return whichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLobgTerm() {
        return lobgTerm;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }

}

