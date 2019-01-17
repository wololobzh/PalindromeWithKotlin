fun main(args: Array<String>)
{
    var mot:String = "Kayak";

    if( isPalindrome(mot))
    {
        println("$mot est un palindrome")
    }else{
        println("$mot n'est pas un palindrome")
    }
}

fun isPalindrome(mot:String)=(mot.toLowerCase() == mot.toLowerCase().reversed())