package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StartUpDAO {
    Connection con= ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    
    public void startup(){
        try{
            st=con.createStatement();
                      st.executeUpdate("""
                        CREATE DATABASE QLKS;

                        CREATE TABLE NguoiDung (
                            UserID CHAR(8) NOT NULL,
                            UserName VARCHAR(100) NOT NULL,
                            UserPass VARCHAR(32) NOT NULL,
                            UserRName VARCHAR(100) NOT NULL,
                            UserCID CHAR(12) NOT NULL,
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
                            RoomDRID CHAR(3),
                            PRIMARY KEY(RoomID)
                        );
                        
                        CREATE TABLE HoaDon (
                            BillID INT AUTO_INCREMENT,
                            WkID CHAR(8) NOT NULL,
                            ClientID CHAR(10) NOT NULL,
                            DateIn DATE NOT NULL,
                            DateOut DATE NOT NULL,
                            BillTotal INT,
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
                            BDID BIGINT AUTO_INCREMENT,
                            BillID INT NOT NULL,
                            SvcID CHAR(6),
                            RoomID CHAR(8),
                            BDPrice INT NOT NULL,
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
                        
                        ALTER TABLE QuanLy ADD CONSTRAINT FK_QuanLy_NguoiDung FOREIGN KEY (UserID) REFERENCES NguoiDung (UserID);
                        ALTER TABLE NhanVien ADD CONSTRAINT FK_NhanVien_NguoiDung FOREIGN KEY (UserID) REFERENCES NguoiDung (UserID);
                        ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_HoaDon FOREIGN KEY(BillID) REFERENCES HoaDon (BillID);
                        ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_DichVu FOREIGN KEY (SvcID) REFERENCES DichVu (SvcID);
                        ALTER TABLE ChiTietHoaDon ADD CONSTRAINT FK_ChiTietHoaDon_Phong FOREIGN KEY (RoomID) REFERENCES Phong (RoomID);
                        ALTER TABLE HoaDon ADD CONSTRAINT FK_HoaDon_KhachHang FOREIGN KEY (ClientID) REFERENCES KhachHang(ClientID);
                        ALTER TABLE HoaDon ADD CONSTRAINT FK_HoaDon_NhanVien FOREIGN KEY (WkID) REFERENCES NhanVien(WkID);
                        Set Foreign_key_checks = 0;
                        INSERT into NGUOIDUNG Values('QL000000','manager','1','Quan Ly','07900000000','0900001002',1);
                        INSERT into NGUOIDUNG Values('NV000000','worker','1','Nhan Vien','07900000001','0900002001',1);
                        INSERT into QUANLY Values('000000',1,'QL000000');
                        INSERT INTO nhanvien VALUES('000000','000000','NV000000','test');
                        Set foreign_key_checks = 1;""");
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi chạy lần đầu!");
            System.out.println("Lỗi chạy lần đầu");
        }
    }
}
