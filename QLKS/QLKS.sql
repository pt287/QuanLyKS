
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
	RoomSTT CHAR(1) NOT NULL CHECK(RoomSTT IN('C','R','F','O')),
    RoomNote VARCHAR(50),
    RoomPrice INT NOT NULL,
    RoomDRID CHAR(3),
	PRIMARY KEY(RoomID)
);

CREATE TABLE HoaDon (
	BillID INT AUTO_INCREMENT,
	WkID CHAR(8) NOT NULL,
    ClientID CHAR(8) NOT NULL,
    DateIn DATE NOT NULL,
    DateOut DATE NOT NULL,
    BillTotal INT,
	PRIMARY KEY(BillID)
);

CREATE TABLE KhachHang(
	ClientID CHAR(8) NOT NULL,
    ClientName VARCHAR(100) NOT NULL,
    ClientPhoneNum CHAR(10) NOT NULL,
    ClientCID CHAR(12) NOT NULL,
    PRIMARY KEY(ClientID)
);

CREATE TABLE DichVu(
	SvcID CHAR(8) NOT NULL,
    SvcName VARCHAR(100) NOT NULL,
    SvcPrice INT NOT NULL,
    PRIMARY KEY (SvcID)
);

CREATE TABLE ChiTietHoaDon(
	BDID BIGINT AUTO_INCREMENT,
    BillID INT NOT NULL,
    SvcID CHAR(8),
    RoomID CHAR(8),
    BDPrice INT NOT NULL,
    PRIMARY KEY (BDID)
);

CREATE TABLE QuanLy(
	MngID CHAR(8) NOT NULL,
    MngCount Int NOT NULL,
    UserID CHAR(8) NOT NULL,
    PRIMARY KEY(MngID,USERID)
);

CREATE TABLE NhanVien(
	WkID CHAR(8) NOT NULL,
    MngID CHAR(8) NOT NULL,
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
INSERT INTO NguoiDung VALUES('QL000001','capijim','capijm0','Đặng Thế Vinh','079204000222','0900000000',1);
INSERT INTO NguoiDung VALUES('QL000002','tuilazit','Citizens1894','Trần Trung Việt','079204000271','0937024435',1);
INSERT INTO NguoiDung VALUES('QL000003','pt278','PhatTran','Trần Đăng Phát','079204009999','0999999999',1);
INSERT INTO NguoiDung VALUES('QL000004','copilot','c0p1l0t','Cô Pai Lốt','101100111011','0110100101',1);
INSERT INTO NguoiDung VALUES('NV000005','lqhyu04','chgcb123','Lê Quốc Huy','079204000123','0969669747',1);
INSERT INTO NguoiDung VALUES('NV000006','ngomphat','minhphat234','Ngô Minh Phát','079204002211','0955774184',1);
INSERT INTO NguoiDung VALUES('NV000007','AiNuHK','ndquoc','Nguyễn Đại Quốc','079200042567','0887744667',1);
INSERT INTO NguoiDung VALUES('NV000008','DanhCaNgocTuan','TuanNgoc123','Nguyễn Ngọc Tuấn','079201000664','0978444555',1);
INSERT INTO NguoiDung VALUES('NV000009','ReMind','remindne','Du Phong Linh','079200004123','0978456123',1);
INSERT INTO NguoiDung VALUES('NV000010','TCHKeria','LTT123','Lương Thanh Tuấn','079801000245','0387123589',1);
INSERT INTO NguoiDung VALUES('NV000011','ToiLaChuTich','16DongThung','Rodri','079204004222','0422242310',1);
INSERT INTO NguoiDung VALUES('NV000012','PhilFoden','FD47','Phil Foden','079201000474','0947474747',1);
INSERT INTO NguoiDung VALUES('NV000013','Haaland','MC4ever','Erling Haaland','079401000999','0917099900',1);
INSERT INTO NguoiDung VALUES('NV000014','TrungKevin','KDB17','Kevin De Bruyne','079701700174','0917171717',1);
INSERT INTO NguoiDung VALUES('NV000015','Jack100Cu','J100','Jack Grealish','079204022547','0955647813',1);
INSERT INTO NguoiDung VALUES('QL000016','PepTroc','2treblegogo','Pep Guardiola','0792044011','0795000123',1);
INSERT INTO NguoiDung VALUES('NV000017','DokuCauGoc','DokuDoku','Jeremy Doku','079204078954','0123456789',1);
INSERT INTO NguoiDung VALUES('NV000018','anhBenDzai','Diasking','Ruben Dias','07980000753','0987254361',1);
INSERT INTO NguoiDung VALUES('NV000019','anhSonGauCB','JoskoCroatia','Josko Gvardiol','072404000258','0792242451',1);
INSERT INTO NguoiDung VALUES('NV000020','anhSonGK','EdersonGK','Ederson Moraes','073104001258','0792313351',1);
INSERT INTO NguoiDung VALUES('NV000021','anhJohnDa','Stones5','John Stones','073104008765','0755512251',1);
INSERT INTO NguoiDung VALUES('NV000022','StfOrtega','OrtegaGK','Steffan Ortega','073104001118','0784175342',1);
INSERT INTO NguoiDung VALUES('NV000023','BobbMCI','Bobb123','Oscar Bobb','073104007482','0741863952',1);
INSERT INTO NguoiDung VALUES('NV000024','KyleDiBo','Walker3Lions','Kyle Walker','073303000123','0333333333',1);
INSERT INTO NguoiDung VALUES('NV000025','emutLewis','LewisRC','Rico Lewis','045602000785','022546831',1);
INSERT INTO NguoiDung VALUES('NV000026','AkeAke','Ake06','Nathan Ake','045125478666','0852467865',1);
INSERT INTO NguoiDung VALUES('NV000027','anhThuKy','Akanji25','Manuel Akanji','073104251258','0752583251',1);
INSERT INTO NguoiDung VALUES('NV000028','Alvarezzz','dungnenvanminh','Julian Alvarez','045602000111','0859172541',1);
INSERT INTO NguoiDung VALUES('NV000029','nunanotnunong','Nunes27','Matheus Nunes','073178401258','0792274351',1);
INSERT INTO NguoiDung VALUES('NV000030','Kovakovak','MateoCroatia','Mateo Kovacik','073104001258','0792313351',1);

INSERT INTO QUANLY VALUES('QL000001',5,'QL000001');
INSERT INTO QUANLY VALUES('QL000002',5,'QL000002');
INSERT INTO QUANLY VALUES('QL000003',5,'QL000003');
INSERT INTO QUANLY VALUES('QL000004',5,'QL000004');
INSERT INTO QUANLY VALUES('QL000016',5,'QL000016');

INSERT INTO NhanVien VALUES('NV000005','QL000002','NV000005','Công Nghệ');
INSERT INTO NhanVien VALUES('NV000006','QL000002','NV000006','Điện Tử');
INSERT INTO NhanVien VALUES('NV000007','QL000001','NV000007','Giữ Trẻ');
INSERT INTO NhanVien VALUES('NV000008','QL000001','NV000008','Ca Sĩ');
INSERT INTO NhanVien VALUES('NV000009','QL000003','NV000009','Nghệ Sĩ Hài');
INSERT INTO NhanVien VALUES('NV000010','QL000003','NV000010','Sân Cầu Lông');
INSERT INTO NhanVien VALUES('NV000011','QL000004','NV000011','Chủ Tịch Nhân Viên');
INSERT INTO NhanVien VALUES('NV000012','QL000004','NV000012','Lễ Tân');
INSERT INTO NhanVien VALUES('NV000013','QL000016','NV000013','Phụ Trách Phòng Trẻ');
INSERT INTO NhanVien VALUES('NV000014','QL000016','NV000014','Trưởng Phục Vụ');
INSERT INTO NhanVien VALUES('NV000015','QL000001','NV000015','Phục Vụ Bar');
INSERT INTO NhanVien VALUES('NV000017','QL000001','NV000017','Dancer');
INSERT INTO NhanVien VALUES('NV000018','QL000002','NV000018','Bảo Vệ');
INSERT INTO NhanVien VALUES('NV000019','QL000002','NV000019','Lễ Tân');
INSERT INTO NhanVien VALUES('NV000020','QL000003','NV000020','Phòng Xăm');
INSERT INTO NhanVien VALUES('NV000021','QL000003','NV000021','Hỗ Trợ Bar');
INSERT INTO NhanVien VALUES('NV000022','QL000004','NV000022','Lễ Tân');
INSERT INTO NhanVien VALUES('NV000023','QL000004','NV000023','Phục Vụ');
INSERT INTO NhanVien VALUES('NV000024','QL000016','NV000024','Lao Công');
INSERT INTO NhanVien VALUES('NV000025','QL000016','NV000025','Lao Công');
INSERT INTO NhanVien VALUES('NV000026','QL000002','NV000026','Phục Vụ');
INSERT INTO NhanVien VALUES('NV000027','QL000001','NV000027','Kế Toán');
INSERT INTO NhanVien VALUES('NV000028','QL000003','NV000028','Phục Vụ');
INSERT INTO NhanVien VALUES('NV000029','QL000004','NV000029','Phục Vụ');
INSERT INTO NhanVien VALUES('NV000030','QL000016','NV000030','Bảo Vệ');

INSERT INTO DichVu VALUES('RoofBar1','Bar Tầng Thượng',500000);
INSERT INTO DichVu VALUES('Tattoo01','Xăm cỡ nhỏ',1500000);
INSERT INTO DichVu VALUES('Tattoo02','Xăm cỡ vừa',700000);
INSERT INTO DichVu VALUES('Tattoo03','Xăm cỡ lớn',1000000);
INSERT INTO DichVu VALUES('Child001','Giữ Trẻ',450000);
INSERT INTO DichVu VALUES('Acoustic','Acoustic ngoài trời',1500000);
INSERT INTO DichVu VALUES('Badmin01','Sân Cầu Lông 1',500000);
INSERT INTO DichVu VALUES('Badmin02','Sân Cầu Lông 2',500000);
INSERT INTO DichVu VALUES('Badmin03','Sân Cầu Lông 3',500000);
INSERT INTO DichVu VALUES('Badmin04','Sân Cầu Lông 4',500000);
INSERT INTO DichVu VALUES('Golf0001','Sân Golf',3000000);
INSERT INTO DichVu VALUES('MiniGolf','Sân Mini Golf',1500000);
INSERT INTO DichVu VALUES('StandCMD','Hài Độc Thoại',700000);
INSERT INTO DichVu VALUES('BAR00001','Bar Thường',300000);


INSERT INTO KHACHHANG VALUES('Cl000001','Lân Vơ Đì','0903333333','079303000333');
INSERT INTO KHACHHANG VALUES('Cl000002','Đào Văn Phú','0902222222','079202002222');
INSERT INTO KHACHHANG VALUES('Cl000003','Nguyễn Hồng Đức','0941248754','079303000333');
INSERT INTO KHACHHANG VALUES('Cl000004','Phù Chi Tuấn','0917015016','079401000541');
INSERT INTO KHACHHANG VALUES('Cl000005','Lư Hoàng Khang','0901247541','074102000547');
INSERT INTO KHACHHANG VALUES('Cl000006','Hải Hậu Mai','0974124785','079303400412');
INSERT INTO KHACHHANG VALUES('Cl000007','Anthony Ng','0123486745','079451747541');
INSERT INTO KHACHHANG VALUES('Cl000008','Đàm Vĩnh Hưng','0905412654','079312478324');
INSERT INTO KHACHHANG VALUES('Cl000009','Phan Mạnh Quỳnh','0903374214','079102000123');
INSERT INTO KHACHHANG VALUES('Cl000010','Châu Tinh Trì','0974145784','074851002478');


INSERT INTO HOADON(WkID,ClientID,DateIn,DateOut,BillTotal) VALUES('NV000012','CL000001','2024-03-10','2024-03-15',71450000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (1,null,'PSD25001',11825000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (1,'RoofBar1',null,500000);
INSERT INTO HOADON(WkID,ClientID,DateIn,DateOut,BillTotal) VALUES('NV000019','CL000002','2024-02-02','2024-02-06',32700000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (2,null,'VIP18004',6100000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (2,'MiniGolf',null,700000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (2,'Tattoo01',null,1500000);
INSERT INTO HOADON(WkID,ClientID,DateIn,DateOut,BillTotal) VALUES('NV000022','CL000003','2023-08-07','2024-08-11',12000000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (3,null,'1SB09001',2200000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (3,'StandCMD',null,700000);
INSERT INTO CHITIETHOADON(BillID,SvcID,RoomID,BDPrice) VALUES (3,'Bar00001',null,300000);
Set Foreign_key_checks =1;
