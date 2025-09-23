create database sales_management;
use sales_management;

CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(255) NOT NULL,
    CustomerCity VARCHAR(255) NOT NULL
);

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE OrderItems (
    OrderItemID INT PRIMARY KEY,
    OrderID INT,
    ItemName VARCHAR(255) NOT NULL,
    Quantity INT NOT NULL,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

INSERT INTO Customers (CustomerID, CustomerName, CustomerCity) VALUES
(1, 'Alice', 'Mumbai'),
(2, 'Bob', 'Delhi');

INSERT INTO Orders (OrderID, CustomerID) VALUES
(1, 1),
(2, 2),
(3, 1);

INSERT INTO OrderItems (OrderItemID, OrderID, ItemName, Quantity) VALUES
(1, 1, 'Pen', 2),
(2, 1, 'Book-1', 1),
(3, 2, 'Book-3', 1),
(4, 3, 'Pen', 5),
(5, 3, 'Pencil-3', 1),
(6, 3, 'Book-2', 1);

SELECT o.OrderID, c.CustomerName, c.CustomerCity, oi.ItemName, oi.Quantity
FROM Orders o
JOIN Customers c ON o.CustomerID = c.CustomerID
JOIN OrderItems oi ON o.OrderID = oi.OrderID
ORDER BY o.OrderID;
