package Assignment3;


public class LinkedlistImpl {
	public int row;
	public int col;
	public int data;
	public static int Node;
	
	void create_new_node(CallNode **p, int row_index,
            int col_index, int x)
{
Node *temp = *p;
Node *r;


if (temp == NULL)
{
temp = new Node();
temp->row = row_index;
temp->col = col_index;
temp->data = x;
temp->next = NULL;
*p = temp;
}


else
{
while (temp->next != NULL)  
   temp = temp->next;
    
r = new Node();
r->row = row_index;
r->col = col_index;
r->data = x;
r->next = NULL;
temp->next = r;
}
}


void printList(Node *start)
{
Node *ptr = start;
cout << "row_position:";
while (ptr != NULL)
{
cout << ptr->row << " ";
ptr = ptr->next;
}
cout << endl;
cout << "column_position:";

ptr = start;
while (ptr != NULL)
{
cout << ptr->col << " ";
ptr = ptr->next;
}
cout << endl;
cout << "Value:";
ptr = start;

while (ptr != NULL)
{
cout << ptr->data << " ";
ptr = ptr->next;
}
}


public static int main()
{


int sparseMatrix[][] = { { 0 , 0 , 3 , 0 , 4 },
                      { 0 , 0 , 5 , 7 , 0 },
                      { 0 , 0 , 0 , 0 , 0 },
                      { 0 , 2 , 6 , 0 , 0 } };


Object first;
Node *first = NULL;
for(int i = 0; i < 4; i++)
{
for(int j = 0; j < 5; j++)
{
    
   
   if (sparseMatrix[i][j] != 0)
       create_new_node(&first, i, j,
                       sparseMatrix[i][j]);
}
}
printList(first);

return 0;
}
}
