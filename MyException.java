/*
Name: MyException
Created: Darlene Antonino
Last changed: 09.05.2020; Darlene Antonino
Description: this class contains the exception to test if the drink is small enough for the glasses; it also has a
method to controll, is the exception got thrown
 */

class MyException extends Exception{
    MyException(String d){
        super(d);
    }
}
class TestMyException{
    /* This Exception compares the volume to a fixed double, which represents the max. size of a glass

        @return nothing because "void"
     */
    static void smallEnough(double vol)throws MyException {
        if (vol > 0.75) {
            throw new MyException("This drink is to big for our glasses!");
        }
    }

    /* It will be called if an exception is thrown

    @return true
     */
    static boolean gotThrown (){
        return true;
    }
    }