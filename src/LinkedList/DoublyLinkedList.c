#include<stdio.h>
#include<stdlib.h>

struct D_linkedlist
{
	struct D_linkedlist *l;
	int d;
	struct D_linkedlist *r;
};


typedef struct D_linkedlist node;
node *start=NULL;
node *getnode();
void newnode(int n)
{
	int i,j;
	node *n1,*temp;
	for(i=0;i<n;i++)
	{
		n1=getnode();
		printf("Enter the data:");
		scanf("%d",&n1->d);
		if(start==NULL)
		start=n1;
		else{

		temp=start;
		while(temp->r!=NULL)
		temp=temp->r;

		temp->r=n1;
		n1->l=temp;
	}

	}

}

void display()
{
	node *n=start;
	while(n!=NULL)
	{
		printf("      %d",n->d);
		n=n->r;
	}
}




node *getnode()
{
	node *n;
	n=(node*)malloc(sizeof(node));
	n->l=NULL;
	n->r=NULL;
	return n;

}


int main()
{
	int n;
	printf("Enter the size :");
	scanf("%d",&n);
	newnode(n);
	display();
	return 0;
}