import java.util.*



fun main()
{
    for(i in 0 until 3) /*Essaie limite nb de chance */
    {

        println(i) ;
        var nb_secret: Int = (1..100).random();
        var scan = Scanner(System.`in`)
        do {

            println("Entrez un nombre de 1 à 100 : ");

            var nb_entre: Int = scan.nextInt();

            if (nb_entre == nb_secret)
                {
                    println("Bravo !");
                }
            else if (nb_entre > nb_secret)
                {
                    if(i==9)
                    {
                        if (nb_entre in nb_secret..nb_secret + 5)
                            {
                                println("Trop grand. Mais tu y est presque, dernier essaie ! ")
                            }
                        else
                            {
                                println("Trop grand. Dernier essaie !");
                            }
                    }

                    else
                    {
                        if (nb_entre in nb_secret..nb_secret + 5)
                            {
                                println("Trop grand. Mais tu y est presque ! ")
                            }
                        else
                            {
                                println("Trop grand");
                            }
                    }
                }
            else
                {
                    if (i==9)
                    {
                        if (nb_entre in nb_secret - 5..nb_secret)
                        {
                            println("Trop petit. Mais tu y est presque, dernier essaie ! ")
                        }
                        else
                        {
                            println("Trop petit, dernier essaie ! ");

                        }
                    }

                    else
                    {
                        if (nb_entre in nb_secret - 5..nb_secret)
                            {
                                println("Trop petit. Mais tu y est presque ! ")
                            }
                        else
                            {
                                println("Trop petit");
                            }
                    }
                }
        }
        while (nb_entre != nb_secret)
            {
                main();
            }
    }
}