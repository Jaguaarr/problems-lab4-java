package problem2;

public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    int numberofelements = 0;
    public IntegerList(int size) {
        list = new int[size];
        numberofelements = 0;

    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        System.out.println("Randomizing list");
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
            numberofelements++;
        }
    }
    //-------------------------------------------------------
//Increasing the size of the array
//-------------------------------------------------------
    public void increaseSize()
    {

        int[] list1 = new int[2*list.length];

        for (int i=0; i<list.length; i++){
            list1[i] = list[i];
        }
        list = list1;

    }

    //-------------------------------------------------------
//Adding Elements
//-------------------------------------------------------
    public void addEelement(int element){
        if (numberofelements==list.length){
            System.out.println("increasing the list size, and adding the element : "+element);
            increaseSize();

            list[numberofelements++]=element;
        }
        else{
            System.out.println("the list size allow adding the element, now adding it");
            list[numberofelements++]=element;
        }
    }
    //-------------------------------------------------------
//removing the first occurrence of a value from the list
//-------------------------------------------------------
    public void removeFirst(int element){
        for (int i=0; i<numberofelements; i++){
            if (list[i]==element){
                System.out.println(element+ " successfully found!");
                for (int j=i; j<numberofelements-1; j++){

                    list[j]=list[j+1];
                }

                numberofelements--;
                System.out.println("the number of elements now in the list is :" + numberofelements);
                break;
            }

        }
    }
    //-------------------------------------------------------
//removieng all occurrences
//-------------------------------------------------------
    public void removeAll(int element){
        for (int i=0; i<numberofelements; i++){
            if (list[i]==element){
                for (int j=i; j<numberofelements-1; j++){
                    list[j]=list[j+1];
                }
                numberofelements--;
            }

        }
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<numberofelements; i++)
            System.out.println(i + ":\t" + list[i]);
    }
}