package buoi2009.ex2_OOP;

public class test {

    public static void main(String[] args) {
        director one = new director(101, "Tran Minh Nghia");
        director two = new director(102, "Tran Minh Ngia");
        director three = new director(103, "Tran Minh Nghi");
        director four = new director(104, "Tran Minh Ngh");

        ArrayList<Movie> aList = new ArrayList<>(10);
        aList.add(new Movie("Cuon theo chieu gio", 1990
                , new director[]{one, four}
                , new String[]{genre.ACTION, genre.COMEDY}));
    

System.out.println("Count = " + aList.size());
//////////////////////////////////////
//------------------a-------------------
//Find the number of movie of each director
director[] listdirector = new director[] {one, two, three, four, five};
for(director)
    }
}
