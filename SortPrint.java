import java.util.Scanner;

public class SortPrint
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int amOfCase = sc.nextInt();

        Student [] array = new Student[amOfCase];



        for (int i = 0; i < amOfCase; i++)
        {

            array[i].roll = sc.nextInt();
            array[i].name = sc.nextLine();
            array[i].marks = sc.nextInt();
        }
        array = sortkori(array);
        System.out.println("Roll | Name       | Marks");
        printKori(array);
    }

    public static Student[] sortkori(Student [] gArray)
    {
        Student temp = new Student(0, "", 0);

        for (int i = 0; i < gArray.length; i++)
        {
            for(int j = i + 1; j < gArray.length; j++)
            {
                if(gArray[i].marks < gArray[j].marks)
                {
                    temp = gArray[i];
                    gArray[i] = gArray[j];
                    gArray[j] = temp;
                }

                else if (gArray[i].marks == gArray[j].marks)
                {
                    if (gArray[i].roll > gArray[j].roll)
                    {
                        temp = gArray[i];
                        gArray[i] = gArray[j];
                        gArray[j] = temp;
                    }
                }
            }
        }
        return gArray;
    }

    public static void printKori(Student[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.format("%4d | %10s | %5d\n", array[i].roll, array[i].name, array[i].marks);
        }
    }
}
