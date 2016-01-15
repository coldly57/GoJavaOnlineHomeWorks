package module6.task3musicalinstrument;

public class NoGuitarException extends Exception {
    private int guitarCount;

    public NoGuitarException(final int guitarCount){
        this.guitarCount = guitarCount;
    }

    public int getGuitarCount(){
        return this.guitarCount;
    }

    public String getExceptionMessage(){
        return String.format("%s can't exist with %d guitars in it!", MusicShop.class.getSimpleName(), getGuitarCount());
    }

}
