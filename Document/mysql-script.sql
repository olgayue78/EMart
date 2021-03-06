CREATE TABLE emart.`user` (
	id INT NOT NULL AUTO_INCREMENT,
    username varchar(256) NULL,
	email varchar(256) NOT NULL,
	password varchar(100) NOT NULL,
	user_role varchar(1) NOT NULL,
	bussiness_address varchar(1024) NULL,
	gtsin varchar(100) NULL,
	bussiness_name varchar(256) NULL,
	websit_url varchar(1024) NULL,
	telephone varchar(100) NULL,
	bank_name varchar(100) NULL,
	bank_number varchar(100) NULL,
	company_brief TEXT NULL,
	CONSTRAINT User_PK PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE emart.item (
	id INT NOT NULL AUTO_INCREMENT,
	item_name varchar(512) NULL,
	category varchar(100) NULL,
	subcategory varchar(100) NULL,
	price DOUBLE NULL,
	stock_nmuber INT NULL,
	description TEXT NULL,
	seller_id INT NULL,
	CONSTRAINT item_PK PRIMARY KEY (id),
	CONSTRAINT item_User_FK FOREIGN KEY (id) REFERENCES emart.`user`(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE emart.picture (
	id INT NOT NULL AUTO_INCREMENT,
	url varchar(512) NULL,
	item_id INT ,
	CONSTRAINT pictures_PK PRIMARY KEY (id),
    CONSTRAINT item_pictures_FK FOREIGN KEY (item_id) REFERENCES emart.item(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE emart.cartitem (
	id INT NOT NULL AUTO_INCREMENT,
	item_id INT NULL,
	qty INT NOT NULL,
	tax DOUBLE NULL,
	discount DOUBLE NULL,
	seller_id INT NULL,
	buyer_id INT NULL,
	CONSTRAINT cartitem_PK PRIMARY KEY (id),
	CONSTRAINT cartitem_item_FK FOREIGN KEY (item_id) REFERENCES emart.item(id),
	CONSTRAINT cartitem_user_FK FOREIGN KEY (seller_id) REFERENCES emart.`user`(id) ,
    CONSTRAINT cartitem_seller_FK FOREIGN KEY (buyer_id) REFERENCES emart.`user`(id) 
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE emart.purchaseitem (
	id INT NOT NULL AUTO_INCREMENT,
	buyer_id INT NULL,
	seller_id INT NULL,
	item_id INT NULL,
	qty INT NULL,
	price DOUBLE NULL,
	purchase_date TIMESTAMP NULL,
	CONSTRAINT purchaseitem_PK PRIMARY KEY (id),
	CONSTRAINT purchaseitem_buyer_FK FOREIGN KEY (buyer_id) REFERENCES emart.`user`(id),
	CONSTRAINT purchaseitem_seller_FK FOREIGN KEY (seller_id) REFERENCES emart.`user`(id),
	CONSTRAINT purchaseitem_item_FK FOREIGN KEY (item_id) REFERENCES emart.item(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
