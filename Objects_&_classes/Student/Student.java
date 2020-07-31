package OBJECTS;

class Student {

    private String first;
    private String middle;
    private String last;

    public void setNames(String first, String middle, String last) {
        this.first  = first;
        this.middle = middle;
        this.last = last;
    }

    //return
    public String getFullName() {
        return first + " " + middle.charAt(0) + ". " + last;
    }

}

