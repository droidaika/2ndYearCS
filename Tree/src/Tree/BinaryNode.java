package Tree;




  private T data;
  private BinaryNode<T> left;



  {
    this(null); // call next constructor
  }

  




                                   BinaryNode<T> rightChild)

    data = dataPortion;
    left = leftChild;
    right = rightChild;



  {




  {




  {



  public BinaryNodeInterface<T> getRightChild()
  {
    return right;
  } 

  public void setLeftChild(BinaryNodeInterface<T> leftChild)
  {

  } 

  public void setRightChild(BinaryNodeInterface<T> rightChild)
  {

  }

  public boolean hasLeftChild()
  {

  } 

  public boolean hasRightChild()
  {
     return right != null;
  } 

  public boolean isLeaf()
  {

  } 

  public BinaryNodeInterface<T> copy()
  {
    BinaryNode<T> newRoot = new BinaryNode<T>(data);
    
    if (left != null)


    if (right != null)


    return newRoot;
  }

  public int getHeight()


  } 

  private int getHeight(BinaryNode<T> node)
  {

  
          if (node != null)
	    height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
       
  } 

  public int getNumberOfNodes()
  {



  


    


    
  }

