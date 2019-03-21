public class Basketball extends Ball{

    //compare this bounce to parent classes bounce

    @Override //this is now flagged to the compiler as specifically being an overriden method. So protects against errors vs parent, like typos
    public void bounce(){ //this is underlined if parent (Ball.java) is flagged as '@Deprecated'. Change as necessary.

        System.out.println("Basketball bounce");
    }
}
