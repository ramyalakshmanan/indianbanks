# indianbanks

DB repo can be found here: https://github.com/snarayanank2/indian_banks

http://localhost:8080/bankinfo/api/bank/branch/ABHYXXX

{
  "code": "NotFoundException",
  "message": "No Branch entry found with ifsc: <ABHY0065001>"
}

http://localhost:8080/bankinfo/api/bank/branch/ABHY0065002

{
  "bank": {
    "id": 60,
    "name": "ABHYUDAYA COOPERATIVE BANK LIMITED"
  },
  "branches": [
    {
      "ifsc": "ABHY0065002",
      "branch": "ABHYUDAYA NAGAR",
      "address": "ABHYUDAYA EDUCATION SOCIETY, OPP. BLDG. NO. 18, ABHYUDAYA NAGAR, KALACHOWKY, MUMBAI - 400033",
      "city": "MUMBAI",
      "district": "GREATER MUMBAI",
      "state": "MAHARASHTRA"
    }
  ]
}


http://localhost:8080/bankinfo/api/bank/branch?bankName=HDFC%20BANK&city=chennai

{
  "bank": {
    "id": 5,
    "name": "HDFC BANK"
  },
  "branches": [
    {
      "ifsc": "HDFC0000004",
      "branch": "CHENNAI - ITC CENTRE - ANNA SALAI",
      "address": "759, ITC CENTREANNA SALAI, OPP T.V.S.CHENNAITAMILNADU600 002",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000010",
      "branch": "BESANT NAGAR CHENNAI",
      "address": "T-31, 7TH AVENUE, MG ROAD,BESANT NAGAR  CHENNAI TAMILNADU 600090",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000017",
      "branch": "CHENNAI - ANNA NAGAR",
      "address": "AA - 8, 2ND AVENUEANNA NAGARCHENNAITAMILNADU600 040",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000024",
      "branch": "CHENNAI - VALSARAVAKKAM",
      "address": "PLOT NO 8ARCOT ROADVALSARAVAKKAMCHENNAITAMILNADU600 087",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000082",
      "branch": "CHENNAI - NUNGAMBAKKAM",
      "address": "NO.40, NUNGAMBAKKAM HIGH ROAD(N.H.ROAD)CHENNAITAMILNADU600034",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000111",
      "branch": "CHENNAI - MADIPAKKAM",
      "address": "77 MEDAVAKKAM HIGH ROAD,MADIPAKKAMCHENNAITAMILNADU600091",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000124",
      "branch": "CHENNAI - KILPAUK",
      "address": "NO 31/32 BALFOUR ROADKILPAUKCHENNAITAMILNADU600 010",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000128",
      "branch": "CHENNAI - CREDIT CARD OPERATIONS",
      "address": "PRINCE KUSHAL TOWERS96,ANNA SALAICHENNAICHENNAITAMILNADU600002",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000136",
      "branch": "CHENNAI - ASHOK NAGAR",
      "address": "NO.53, PLOT NO 8414TH AVENUE,ASHOK NAGARCHENNAITAMILNADU600 083",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000141",
      "branch": "CHENNAI - R A PURAM",
      "address": "NO.10, THIRD CROSS STREET,R.A.PURAMCHENNAITAMILNADU600028",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000166",
      "branch": "CHENNAI - PARRYS CORNER",
      "address": "NO 3, MCDOWELL HOUSE2ND LINE BEACHPARRYS CORNERCHENNAITAMILNADU600001",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000206",
      "branch": "CHENNAI - T NAGAR",
      "address": "56,G.N.CHETTY ROADT NAGARCHENNAITAMILNADU600017",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000260",
      "branch": "CHITLAPAKKAM",
      "address": "CHITLAPAKKAM-CHENNAI NO 8, RAJENDRA PRASAD ROAD, NEHRU NAGAR, CHITLAPAKKAM, LANDMARK - NEXT TO HP PETROL BUNK, CHENNAI TAMILNADU 600044",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000323",
      "branch": "CHENNAI - MYLAPORE",
      "address": "HDFC BANK LTD NO. 2, P S SIVASAMY SALAI, MYLAPORE CHENNAI TAMILNADU 600004",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000386",
      "branch": "SAN THOME-CHENNAI-TAMIL NADU",
      "address": "SENANS SQUARE NO99 SANTHOME HIGH ROAD SANTHOME CHENNAI TAMIL NADU 600028",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000390",
      "branch": "CHENNAI - PORUR",
      "address": "98/99, DUAL GARDENS,MOUNT POONAMALLEE ROAD,PORURCHENNAITAMIL NADU600116",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000441",
      "branch": "CHENNAI - NELSON MANICKAM ROAD",
      "address": "NO:117,NELSON TOWERS,NELSON MANICKAM ROAD.CHENNAITAMIL NADU600029",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000444",
      "branch": "CHENNAI - VELACHERY",
      "address": "30 K G TOWERS,VELACHERY BYEPASS ROAD,VELACHERYCHENNAITAMIL NADU600042",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000492",
      "branch": "POONAMALEE HIGH ROAD - TAMIL NADU",
      "address": "NO 808, POONAMALEE HIGH ROAD, KILPAUK, CHENNAI, TAMIL NADU - 600010",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000493",
      "branch": "MOGAPPAIR TAMIL NADU",
      "address": "NO. 1 BLOCK NO. 5, PARI SALAI, MOGAPPAIR EAST, CHENNAI TAMILNADU 600037",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000500",
      "branch": "KOTTIVAKKAM - TAMIL NADU",
      "address": "PLOT NO:26 , EAST COAST ROAD, KOTTIVAKKAM, CHENNAI, TAMIL NADU - 600041",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000575",
      "branch": "CHENNAI - WEST MAMBALAM",
      "address": "50, ARYA GOWDA ROAD, WEST MAMBALAM  CHENNAI TAMILNADU 600033",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000674",
      "branch": "CHENNAI - NANGANALLUR",
      "address": "PLAT NO. 46, DOOR NO. 23,FIRST MAIN ROAD, NANGANALLUR.",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000675",
      "branch": "CHENNAI - GOPALAPURAM",
      "address": "CENTRE POINT, NO. 221 AND 222, LLOYDS ROAD, GOPALAPURAM CHENNAI TAMILNADU 600086",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000687",
      "branch": "CHENNAI - ANNA NAGAR 3RD AVENUE",
      "address": "GANGWAL MANSION,J-14,111 AVENUE, ANNA NAGAR,  CHENNAI TAMILNADU 600102",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000688",
      "branch": "CHENNAI - WASHERMENPET",
      "address": "287, T.H ROAD, OLD WASHERMENPET,CHENNAI TAMILNADU 600021",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000750",
      "branch": "CHENNAI - POONAMALLEE",
      "address": "27 A,1 ST FLR,TRUNK ROAD, POONAMALLEE CHENNAI CHENNAI TAMILNADU 600056",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000751",
      "branch": "CHENNAI - PATTABIRAM",
      "address": "419 MTH ROAD, PATTABHIRAM  CHENNAI TAMILNADU 600072",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000795",
      "branch": "CHENNAI - PERUNGUDI",
      "address": "27 NEW MGR, MAIN ROAD, KANDANCHAVADI, PERUNGUDI CHENNAI TAMILNADU 600096",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000847",
      "branch": "CHENNAI - THIRUVANMIYUR",
      "address": "BANK HOUSE, NO 8, OLD NO. 160/161L.B ROAD,THIRUVANMIYUR,",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0000880",
      "branch": "PERAMBUR",
      "address": "NEW NO-104, OLD NO-284,PAPER MILLS ROAD,PERAMBUR,NEXT TO SINGAPORE PLAZA,",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001052",
      "branch": "K K NAGAR",
      "address": "NO 5 MIG P T RAJAN SALAI K K NAGAR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001072",
      "branch": "KOYAMBEDU - CHENNAI",
      "address": "PLOT NO.5B,JAWAHARLAL NEHRU ROADRATNAPURI LAYOUT, KOYAMBEDU",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001073",
      "branch": "VEPERY - CHENNAI",
      "address": "HDFC BANK LTD.YWCA, 1086,P.H.ROAD,",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001097",
      "branch": "R.K.SALAI - CHENNAI",
      "address": "HDFC BANK LTDNO.115, R.K.SALAIOPP KALYANI HOSPITAL",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001216",
      "branch": "PADMA COMPLEX",
      "address": "320ANNA SALAINANDANAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001225",
      "branch": "SECOND AVENUE",
      "address": "995-CSECOND AVENUENAGAR (W)",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001237",
      "branch": "THAMBU CHETTY STREET",
      "address": "189,THAMBU CHETTY STREETPARRYS",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001284",
      "branch": "EGMORE BRANCH",
      "address": "HDFC BANK LTDKAITHOTTA HOUSE,NEW NO.5,SAIT COLONY FIRST STREET,",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001290",
      "branch": "T.I MATRICULATION SCHOOL",
      "address": "AMBATTUR GROUND FLOOR411 M T HIGH ROADAMBATTUR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001297",
      "branch": "VADAPALANI",
      "address": "HDFC BANK LTD. , MD TOWERS,NO.56, VADAPALANI, JAWAHARLAL NEHRU ROAD,100 FEET ROAD",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001299",
      "branch": "VELLAYAN CHETTIAR HIGHER SEC SCHOOL",
      "address": "NO 754T H ROADTHIRUVOTTIYUR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001305",
      "branch": "KOTTURPURAM",
      "address": "HDFC BANK LTD 46, GANDHI MANDAPAM ROAD, KOTTURPURAM , TAMILNADU, PIN 600085",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001364",
      "branch": "RAHEJA TOWERS",
      "address": "S 0004 ALPHA WING RAHEJA TOWERS",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001586",
      "branch": "PRECISION PLAZA GROUND FLOOR",
      "address": "281 MOUNT ROADTEYNAMPETCHENNAI",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001587",
      "branch": "II AVENUE",
      "address": "ANNA NAGAR CHENNAI NO 5107H 2 I I AVENUEANNA  NAGAR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001765",
      "branch": "WEST MOGAPPAIR",
      "address": "HDFC BANK LTD NO.12, 6TH BLOCK TNHB, MOGAPPAIR WEST",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001852",
      "branch": "KARAPAKKAM",
      "address": "NO.117, OLD MAHABALIPURAM ROAD KARAPAKKAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001857",
      "branch": "MARAIMALAI NAGAR",
      "address": "HIG 80, PAVENDAR SALAI, NHI MARAIMALAI NAGAR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001858",
      "branch": "ADAMBAKKAM",
      "address": "AN TOWERS, NO.27 VELLALAR STREET ADAMBAKKAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001861",
      "branch": "ARUMBAKKAM",
      "address": "N K COMPLEX, NO.15, RAZACK GARDEN,MMDA ARUMBAKKAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001862",
      "branch": "TRIPLICANE",
      "address": "HDFC BANK LTDNO.37 1ST FLOOR,CAR STREET, TRIPLICANE",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001863",
      "branch": "MANDAVELI",
      "address": "DOOR NO.5 & 6, VENKATAKRISHNA ROAD MANDAVELI",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001864",
      "branch": "TNAGAR - 2",
      "address": "OLD NO - 34, NEW NO - 105 HABIBULLAH ROAD TNAGAR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001865",
      "branch": "AYANAVARAM",
      "address": "CG 1,2,3, VARALAKSHMI VILLANO 217/219KONNUR HIGH ROAD, AYANAVARAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001866",
      "branch": "ADYAR",
      "address": "HDFC BANK LTDIRIS, OLD NO.70, NEW NO.69KASTURIBAI NAGAR, 3RD MAIN ROAD,",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001867",
      "branch": "MAHALINGAPURAM",
      "address": "HDFC BANK LTD NO.11, MAHALINGAPURAM MAIN ROAD, MAHALINGAPURAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001869",
      "branch": "DLF-RAMAPURAM",
      "address": "DLF IT SEZ NO.1/124, SHIVAJI GARDEN, BLOCK 5, GR. FLOOR,MOUNT POONAMALLE HIGH RD,",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001870",
      "branch": "WEST TAMBARAM",
      "address": "#2A, 1ST FLOOR DURAISAMY REDDY STREET, WEST TAMBARAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001871",
      "branch": "PERUNGALATHUR",
      "address": "NO 16/24SRINIVASARAGHAVAN ROADNEW PERUNGALATHUR",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001875",
      "branch": "NANDAMBAKKAM",
      "address": "NO.5/12, MOUNT POONAMALLEE ROAD NEAR CHENNAI TRADE CENTER NANDAMBAKKAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001876",
      "branch": "MAHINDRA CITY",
      "address": "THE CANOPY, BLOCK A , 1ST FLOOR, UNIT-II, 2ND AVENUE, MAHINDRA WORLD CITY, NATHAM SUB(PO)",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001880",
      "branch": "PALLIKARANAI",
      "address": "NETWEST VIJAY, PHASE I VAIGAI BLOCK,NO.48,VELACHERY MAIN ROAD,PALLIKARANAI",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001939",
      "branch": "ALWARPET",
      "address": "S R CENTER,FIRST FLOOR, DOOR NO.9, SRIMAN SRINIVASAN ROAD, ALWARPET PIN  600 018",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001947",
      "branch": "AYYAPPANTHANGAL",
      "address": "NO. 64 VGN NAGAR AYYAPANTHANGAL CHENNAI 600056",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0001989",
      "branch": "ANNA NAGAR - WEST",
      "address": "NO.1513/E1, EAST MAIN ROAD ANNA NAGAR-WEST EXTN PIN  600101",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002014",
      "branch": "MADAMBAKKAM",
      "address": "SHANMUGAR ILLAM NEAR HANSA GARDEN MADAMBAKKAM MAIN RD CHENNAI 600073",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002043",
      "branch": "CIT NAGAR",
      "address": "NO.50, 1ST MAIN ROAD CIT NAGAR NANDANAM",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002046",
      "branch": "NUNGAMBAKKAM - COLLEGE ROAD",
      "address": "PRINCE TOWER COMPLEX, NO.G-04 AND G-05,COLLEGE ROAD NUNGAMBAKKAM PIN  600034",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002050",
      "branch": "PALLAVARAM",
      "address": "PALLAVARAM NO.9 MOSQUE STREET C.PALLAVARAM CHENNAI TAMILNADU",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002064",
      "branch": "RED HILLS",
      "address": "SWAMI COMPLEX, OLD NO.2/2 NEW NO.44/2, FIRST FLOOR BYEPASS ROAD CHENNAI 600 052",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002077",
      "branch": "SOWCARPET",
      "address": "NO.68 GROUND FLOOR, MINT STREET SOWCARPET PIN  600079",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002082",
      "branch": "SALIGRAMAM",
      "address": "NO.75 A, ARCOT ROAD SALIGRAMAM VADAPALANI PIN  600026",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002094",
      "branch": "T NAGAR 3",
      "address": "OLD NO.319B/13, NEW NO.46/B13, SOUTH BOAG ROAD T NAGAR PIN  600017",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002387",
      "branch": "KORATTUR",
      "address": "L253, NEW NO.36, TNHB COLONY, 2ND STREET, KORATTUR, CHENNAI TAMIL NADU 600080",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002404",
      "branch": "ANNANAGAR = VASANATHAM COLONY BRANCH",
      "address": "NO.1743 18TH MAIN ROAD ANNANAGAR WEST CHENNAI TAMIL NADU 600040",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002405",
      "branch": "OLYMPIA TECH PARK = GUINDY",
      "address": "ALTIUS A BLOCK NO.1 SIDCO INDUSTRIAL ESTATE GUINDY CHENNAI TAMIL NADU 600032",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002406",
      "branch": "ASCENDAS  TARAMANI",
      "address": "ASCENDAS INTERNATIONAL TECH PARK, CSIR ROAD TARAMANI  CHENNAI TAMIL NADU 600112",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002461",
      "branch": "MYALPORE  CHENNAI",
      "address": "HDFC BANK LTD., POOJA OLD NO.2, NEW NO.3, K. B DASAN ROAD ALWARPET  CHENNAI TAMIL NADU 600018",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002590",
      "branch": "T NAGAR IV - USMAN ROAD",
      "address": "NO 29, RANGAN STREET, USMAN ROAD, CHENNAI TAMILNADU 600017 INDIA",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002632",
      "branch": "PALAVAKKAM",
      "address": "PALAVAKKAM NO.3/416, EAST COAST ROAD PALAVAKKAM CHENNAI TAMIL NADU 600041",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0002770",
      "branch": "VANAGARAM",
      "address": "HDFC BANK LTD., NO. 105-1B2 AND 1B2A, ADAYALAMPATTU VILLAGE, VANAGRAM, CHENNAI, THIRUVALLUR TAMIL NADU 600095",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0003672",
      "branch": "VALLUVAR SALAI RAMAPURAM",
      "address": "HDFC BANK LTD NO 20 5 SONY PLAZA GRND AND 1ST FLR VALLUVAR SALAI RAMAPURAM CHENNAI TAMIL NADU 600089",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0003742",
      "branch": "PERIYAR NAGAR",
      "address": "HDFC BANK LTD B 33 KARTHIKEYAN SALAI BLOCK NO 32D PREIYAR NAGAR CHENNAI TAMIL NADU 600082",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0003791",
      "branch": "NEELANGARAI",
      "address": "HDFC BANK LTD NO 2 232 KOHINOOR COMPLEX EAST COAST RD NEELANGARAI CHENNAI TAMIL NADU 600115",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0003820",
      "branch": "MONTIETH ROAD EGMORE",
      "address": "HDFC BANK LTD SINDUR ETERNITY NO 60 MONTIETH ROAD EGMORE CHENNAI TAMIL NADU 600008",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0003923",
      "branch": "VELACHERY MAIN ROAD",
      "address": "HDFC BANK LTD NO 325 E 1 GA O NEW NO 46 1 VELACHERY MAIN ROAD VELACHERY CHENNAI TAMIL NADU 600042",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0004102",
      "branch": "VALMIKI NAGAR THIRUVANMIYUR",
      "address": "HDFC BANK LTD NO C2 1ST SEAWARD ROAD VALMIKI NAGAR TIRUVANMIYUR CHENNAITAMIL NADU 600041",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0004166",
      "branch": "TRILL INFO PARK RAMANUJAM IT CITY",
      "address": "HDFC BANK LTD RAMANUJAN IT SEZ NEVILLE BLOCK RAJIV GANDHI SALAI TARAMANI CHENNAI TAMIL NADU 600113",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0004221",
      "branch": "VILLIVAKKAM",
      "address": "NO6 1DAYALU NAGAR VILLIVAKKAM LANDMARK DON BOSCO SCHOOL SRINIVASA NAGAR 1ST MAIN ROAD CHENNAI TAMILNADU 600049",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    },
    {
      "ifsc": "HDFC0004297",
      "branch": "ADYAR GANDHI NAGAR",
      "address": "HDFC BANK LTD GRND FLR SREELA TERRACE NO 105 FIRST MAIN ROAD GANDHI NAGAR CHENNAI TAMIL NADU 600020",
      "city": "CHENNAI",
      "district": "CHENNAI",
      "state": "TAMIL NADU"
    }
  ]
}
