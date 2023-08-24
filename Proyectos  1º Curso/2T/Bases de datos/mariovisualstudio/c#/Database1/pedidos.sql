CREATE TABLE [dbo].[pedidos]
(
	[Id] INT NOT NULL PRIMARY KEY, 
    [idcliente] INT NULL, 
    [idprodcuto] INT NULL, 
    [unidades] INT NULL, 
    [fecha] DATETIME NULL, 
    [numeropedido] NVARCHAR(50) NULL
)
