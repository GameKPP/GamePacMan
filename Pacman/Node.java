package Pacman;

import java.util.*;

public class Node
{
    private String label;
    private boolean visited = false;
    private Vector<Node> neighbors;
    private int nodeId = 0;
    private int XCoord;
    private int YCoord;

    public Node(String label)
    {
        this.label = label;
        neighbors = new Vector<Node>();
    }

    public void SetX(int x)
    {
        XCoord = x;
    }

    public void SetY(int y)
    {
        YCoord = y;
    }

    public int getX()
    {
        return XCoord;
    }

    public int getY()
    {
        return YCoord;
    }

    public void setLabel(String pLabel)
    {
        label = pLabel;
    }

    public void addNeighbor(Node v)
    {
        neighbors.add(v);
    }

    public Iterator<Node> getNeighbors()
    {
        return neighbors.iterator();
    }

    public String getLabel()
    {
        return label;
    }

    public boolean isVisited()
    {
        return visited;
    }

    public void setVisited(boolean flag)
    {
        visited = flag;
    }

    public int getId()
    {
        return nodeId;
    }

    public void setId(int id)
    {
        nodeId = id;
    }

    public String toString()
    {
        return (label + " ");
    }
}
