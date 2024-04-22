CREATE DATABASE QLKS;

CREATE TABLE NguoiDung (
	UserID CHAR(8) NOT NULL,
    UserName VARCHAR(100) NOT NULL,
    UserPass VARCHAR(32) NOT NULL,
    UserPhoneNum CHAR(10) NOT NULL,
    UserSTT BOOL NOT NULL,
    PRIMARY KEY(UserID)
);

CREATE TABLE Phong (
	RoomID CHAR(8) NOT NULL,
    RoomNum CHAR(5) NOT NULL,
    RoomType CHAR(3) NOT NULL CHECK(RoomType IN('1SB','2SB','1DB','2DB','VIP','PSD')),
	RoomSTT CHAR(1) NOT NULL CHECK(RoomSTT IN('C','R','F')),
    RoomNote VARCHAR(50),
    RoomPrice INT NOT NULL,
	PRIMARY KEY(RoomID)
);

CREATE TABLE HoaDon (
	BillID INT NOT NULL,
    ClientID CHAR(10) NOT NULL,
    DateIn DATE NOT NULL,
    DateOut DATE NOT NULL,
    BillTotal INT NOT NULL,
    WkID CHAR(8) NOT NULL,
	PRIMARY KEY(BillID)
);

CREATE TABLE KhachHang(
	ClientID CHAR(10) NOT NULL,
    ClientName VARCHAR(100) NOT NULL,
    ClientPhoneNum CHAR(10) NOT NULL,
    ClientCID CHAR(12) NOT NULL,
    PRIMARY KEY(ClientID)
);

CREATE TABLE DichVu(
	SvcID CHAR(6) NOT NULL,
    SvcName VARCHAR(100) NOT NULL,
    SvcPrice INT NOT NULL,
    PRIMARY KEY (SvcID)
);

CREATE TABLE ChiTietHoaDon(
	BDID BIGINT NOT NULL,
    BillID INT NOT NULL,
    SvcID CHAR(6),
    RoomID CHAR(8),
    ClientID CHAR(10) NOT NULL,
    PRIMARY KEY (BDID)
);

CREATE TABLE QuanLy(
	MngID CHAR(6) NOT NULL,
    MngCount Int NOT NULL,
    UserID CHAR(8) NOT NULL,
    PRIMARY KEY(MngID,USERID)
);

CREATE TABLE NhanVien(
	WkID CHAR(6) NOT NULL,
    MngID CHAR(6) NOT NULL,
    UserID CHAR(8) NOT NULL,
    WkRole VARCHAR(20) NOT NULL,
    PRIMARY KEY(WkID,UserID)
);

CREATE TABLE Phong_DichVu(
	SvcID CHAR(6) NOT NULL,
    RoomID CHAR(8) NOT NULL,
    PRIMARY KEY (SvcID,RoomID)
);

ALTER TABLE QuanLy ADD CONSTRAINT FK_QuanLy_NguoiDung FOREIGN KEY (UserID) REFERENCES NguoiDung (UserID);
ALTER TABLE NhanVien ADD CONSTRAINT FK_NhanVien_NguoiDung FOREIGN KEY (UserID) REFERENCES NguoiDung (UserID);
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_HoaDon FOREIGN KEY(BillID) REFERENCES HoaDon (BillID);
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_DichVu FOREIGN KEY (SvcID) REFERENCES DichVu (SvcID);
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_Phong FOREIGN KEY (RoomID) REFERENCES Phong (RoomID);
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_KhachHang FOREIGN KEY (ClientID) REFERENCES KhachHang (ClientID);
ALTER TABLE HoaDon ADD CONSTRAINT FK_HoaDon_KhachHang FOREIGN KEY (ClientID) REFERENCES KhachHang(ClientID);
ALTER TABLE HoaDon ADD CONSTRAINT FK_HoaDon_NhanVien FOREIGN KEY (WkID) REFERENCES NhanVien(WkID);
ALTER TABLE Phong_DichVu ADD CONSTRAINT FK_PDV_Phong FOREIGN KEY (RoomID) REFERENCES Phong(RoomID);
ALTER TABLE Phong_DichVu ADD CONSTRAINT FK_PDV_DichVu FOREIGN KEY (SvcID) REFERENCES DichVu(SvcID);

INSERT into NGUOIDUNG VALUES('ND000001','DangTheVinh','capijim0','0359855353',1);
INSERT into NGUOIDUNG VALUES('ND000002','TranTrungViet','TrungViet234','0937024435',1);
INSERT into NGUOIDUNG VALUES('ND000003','TranDangPhat','jcungdctuym','0779792132',1);

INSERT into Phong VALUES('1DB01001','01001','1DB','R',' ',400000,NULL);
INSERT into PHONG VALUES('VIP10001','10001','VIP','R',' ',2000000,D01);
