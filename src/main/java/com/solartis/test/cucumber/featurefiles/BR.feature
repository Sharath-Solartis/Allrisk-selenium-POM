Feature: AllRisks flow for BR products

		@Scenario710
		Scenario Outline: To do a regression test
		
				 Given user opens browser "chrome" and enter the "<URL>"
	             Then user enter "<username>" and "<password>" and click on login button for "<S.No>"
	             Then validate home page title "https://plqa.uat.solartis.net/plweb/PersonalLines/Allrisks/HomeV1.xhtml" for "<S.No>"
	             Then click on Homeowner / Dwelling / Condo Quote button for "<S.No>"
	             Then click Continue to Insured without Agency Code for "<S.No>"
		 	     Then enter invalid data <"11111111111111"> as agency code for "<S.No>"
	             Then enter the "<agencyCode>" in Agency Page and click Continue To Insured for "<S.No>"
	             Then click Continue to Insured without filling insured details for "<S.No>"
	             Then enter the "<insuredName>" Then "<insuredMailingAddress>" And "<phoneNumber>" And "<LLC>" And "<LlcPrincipals>" in insured information for "<S.No>"
	             Then click save button in location page for "<S.No>"
	             Then enter location type "<LocationType>" Then "<SameAsInsuredMailingAddress>" Then location address "<LocationAddress>" select occupancy type "<occupancyType>" in location page for "<S.No>"
				 Then enter number of units "<NumberOfUnits>" Then click structure rented "<StructuresRentedToOthers>" in location page for "<S.No>"
				 Then enter the protection class "<ProtectionClass>" Then number of stories "<NumberOfStories>" And number of condo stories "<NumberOfStoriesCondo>" And condo unit "<CondoUnit>" based on "<LocationType>" in location page for "<S.No>"
				 Then enter the construction type "<ConstructionType>" Then cladding type "<CladdingType>" in location page for "<S.No>"
				 Then enter the square feet "<Sq_Feet>" Then year built "<YearBuilt>" in location page for "<S.No>"
				 Then click Override DTC "<OverrideDTC>" Then enter Unit of Measurement "<UnitOfMeasurement>" Then DTC "<DistanceToCoast>" in location page for "<S.No>"
				 Then enter the Heating Type "<HeatingType>" Then Heating Update "<HeatingTypeYearOfUpdate>" in location page for "<S.No>"
				 Then enter the Plumbing Type "<PlumbingType>" Then Plumbing Update "<PlumbingTypeYearOfUpdate>" in location page for "<S.No>"
				 Then enter the Roof Covering "<RoofCovering>" Then Roofing Update "<RoofCoveringYearOfUpdate>" Then for wind territory "<WindTerritory>" enter "<WindRating>" Then Secondary Water Resistance "<SecondaryWaterResistance>" Then Fasteners "<Fasteners>" Then Gutters "<Gutters>" in location page for "<S.No>"
				 Then enter the Electric Type "<ElectricType>" Then Electric Update "<ElectricTypeYearOfUpdate>" in location page for "<S.No>"
				 Then based on "<ElectricTypeYearOfUpdate>" enter the Knob Tube "<KnobTubeAluminium>" in location page for "<S.No>"
				 Then enter the Roof Shape "<RoofShape>" Then for wind territory "<WindTerritory>" enter Parapets "<RoofHaveParapets>" Then RoofBracedUnbraced "<RoofBracedOrUnbraced>" Then RoofSlope "<SlopeOfRoof>" in location page for "<S.No>"
				 Then for wind territory "<WindTerritory>" enter the Roof Anchor "<RoofAnchor>" Then Opening Protection "<OpeningProtection>" enter Protection Size Missiles "<ProtectionSizeMissiles>" in location page for "<S.No>"
				 Then enter the Alarm "<Alarm>" in location page for "<S.No>"
				 Then enter the Sprinkler "<FullInteriorSprinklerSystem>" in location page for "<S.No>"
				 Then enter the Loss Count "<NoOfLosses>" in location page for "<S.No>"
				 Then based on "<NoOfLosses>" enter the Loss Data 1 "<DateOfLoss1>" Then "<TypeOfLoss1>" Then "<DescriptionOfLoss1>" Then "<OpenClosed1>" Then "<AmountPaid1>" Then "<InsuranceCompany1>" in location page for "<S.No>"
				 Then based on "<NoOfLosses>" enter the Loss Data 2 "<DateOfLoss2>" Then "<TypeOfLoss2>" Then "<DescriptionOfLoss2>" Then "<OpenClosed2>" Then "<AmountPaid2>" Then "<InsuranceCompany2>" in location page for "<S.No>"
				 Then based on "<NoOfLosses>" enter the Loss Data 3 "<DateOfLoss3>" Then "<TypeOfLoss3>" Then "<DescriptionOfLoss3>" Then "<OpenClosed3>" Then "<AmountPaid3>" Then "<InsuranceCompany3>" in location page for "<S.No>"
				 Then based on "<NoOfLosses>" enter the Loss Data 4 "<DateOfLoss4>" Then "<TypeOfLoss4>" Then "<DescriptionOfLoss4>" Then "<OpenClosed4>" Then "<AmountPaid4>" Then "<InsuranceCompany4>" in location page for "<S.No>"
				 Then based on "<NoOfLosses>" enter the Loss Data 5 "<DateOfLoss5>" Then "<TypeOfLoss5>" Then "<DescriptionOfLoss5>" Then "<OpenClosed5>" Then "<AmountPaid5>" Then "<InsuranceCompany5>" in location page for "<S.No>"
				 Then click save button and Continue to Underwriting button in location Page for "<S.No>"
				 Then continue to csp page for Occupancy Type "<OccupancyType>" product without filling data for "<S.No>"
				 #Then click Add button Additional Interest Type "<AdditionalInterestType>" without filling data Then Click Save button in Underwriting page for "<S.No>"
			     Then enter the Business Childcare "<BusinessChildcare>" Then Desc Business Activities "<DescBusinessActivities>" Then Any Employees "<AnyEmployees>" Then Daycare Attending Children "<DaycareAttendingChildren>" in location page for "<S.No>"
	 			 Then enter the Swimming Pool "<SwimmingPool>" Then enter Fully Fenced "<FullyFenced>" in Underwriting page for "<S.No>"
	 			 Then enter the Animal Bite "<AnimalBite>" Then enter the Trust Estate "<TrustEstate>" in Underwriting page for "<S.No>"
	 		     Then enter the National Register Historic "<NationalRegisterHistoric>" Then Tours Conducted "<ToursConducted>" in Underwriting page for "<S.No>"
	 			 Then enter the High Profile Individual "<HighProfileIndividual>" And Location In Past "<LocationInPast>" in Underwriting page for "<S.No>"
	 			 Then enter the Location Is Was "<LocationIsWas>" Then Purchase PriceBR "<PurchasePriceBR>" Then enter Date Of PurchaseBR "<DateOfPurchaseBR>" in Underwriting page only for Occupancy Type "<occupancyType>" for "<S.No>"
	 			 Then enter the Type Of Renovation "<TypeOfRenovation>" Then Cost Of Renovations "<CostOfRenovations>" in Underwriting page only for Occupancy Type "<occupancyType>" for "<S.No>"
	 		 	 Then enter the Construction Begun "<ConstructionBegun>" Then Estimated Completion Date "<EstimatedCompletionDate>" Then enter the Renovation Within 3months "<RenovationWithin3months>" in Underwriting page only for Occupancy Type "<occupancyType>" for "<S.No>"
	 			 Then enter the Renovations CompletedBR "<RenovationsCompletedBR>" Then Entity Owned "<EntityOwned>" And Licensed Contracter "<LicensedContracter>"  in Underwriting page only for Occupancy Type "<occupancyType>" for "<S.No>"
	 			 Then enter the Locked Fenced BoardedBR "<LockedFencedBoardedBR>" And Intention For Property "<IntentionForProperty>" in Underwriting page only for Occupancy Type "<occupancyType>" for "<S.No>"
	 			 Then click Add button and enter the Additional Interest Type "<AdditionalInterestType>" Then Additional Interest Name "<AdditionalInterestName>" Then Click Save button in Underwriting page for "<S.No>"
	 			 Then continue to csp page for "<S.No>"	 
	 			 Then enter effective date "<effectiveDate>" in carrier selection page for "<S.No>"
	 			 Then enter policy term "<policyTerm>" in carrier selection page for "<S.No>"
	 			 Then enter billing type "<billingType>" in carrier selection page for "<S.No>"
	 			 Then enter quote type "<quoteType>" in carrier selection page for "<S.No>"
	 			 Then enter Loss Settlement Dwelling "<LossSettlementDwelling>" in carrier selection page for "<S.No>"
	 			 Then enter CoverageA "<CoverageA>" in carrier selection page for "<S.No>"
	 			 Then enter policy Form "<policyForm>" and click Getrates in carrier selection page for "<S.No>"
	 			 Then close alertbox if displayed in carrier selection page for "<S.No>"
	 			 Then enter coverageB "<CoverageB>" for "<policyForm>" in carrier selection page for "<S.No>"
	 			 Then enter coverageC "<CoverageC>" for "<policyForm>" in carrier selection page for "<S.No>"
	 			 Then enter CoverageD "<CoverageD>" for "<policyForm>" in carrier selection page for "<S.No>"
	 			 Then enter Loss Settlement Contents "<LossSettlementContents>" for "<policyForm>" in carrier selection page for "<S.No>"
	 			 Then enter AllOtherPerils Deductible "<AllOtherPerilsDeductible>" in carrier selection page for "<S.No>"
	 			 Then enter Wind Deductible "<WindDeductible>" in carrier selection page for "<S.No>"
	 			 Then enter Dwelling Extended Replacement Cost "<DwellingExtendedReplacementCost>" for "<policyForm>" in carrier selection page for "<S.No>"
	 			 Then enter Water Backup "<WaterBackup>" for "<policyForm>" in carrier selection page for "<S.No>"
	 			 Then enter Ordinance Law Coverage "<OrdinanceOrLawCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Vandalism Malicious Mischief "<VandalismAndMaliciousMischief>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Theft Coverage "<TheftCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Limited Mold Coverage "<LimitedMoldCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Identity Fraud "<IdentityFraud>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Green Upgrades Coverage "<GreenUpgradesCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter GolfCart Collision Coverage "<GolfCartCollisionCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter LossAssessment Coverage "<LossAssessmentCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Personal Injury Coverage "<PersonalInjuryCoverage>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter liability limit options "<PersonalLiability>" And "<MedicalPaymentstoOthers>" for "<policyForm>" in carrier selection page for "<S.No>"	
	 			 Then enter Premises Coverage for Owners "<PremisesCoverageforOwners>" for "<policyForm>" And "<carrierName>" in carrier selection page for "<S.No>"
	 			 Then enter Earthquake Coverage "<EarthquakeCoverage>" for "<State>" in carrier selection page for "<S.No>"
	 			 Then click refresh premium in carrier selection page for "<S.No>"
	 			 Then get output values for "<carrierName>" for "<State>" and store those in DB for "<S.No>"
	 			 Then click Create Quote button for "<carrierName>" for "<S.No>"
	 			 Then Override rules for "<S.No>"
	 			 Then enter Declining carrier1 "<Decliningcarrier1>" Then Declining carrier2 "<Decliningcarrier2>" Then Declining carrier3 "<Decliningcarrier3>" information for the states "<State>" for "<S.No>"
	 			 Then select Date Declined1 "<Datedeclined1>" Then Date Declined2 "<Datedeclined2>" Then Date Declined3 "<Datedeclined3>" for the states "<State>" for "<S.No>"
	 			 Then enter Carrier Representative1 "<Carrierrep1>" Then Carrier Representative2 "<Carrierrep2>" Then Carrier Representative3 "<Carrierrep3>" for the states "<State>" for "<S.No>"
	 			 Then select Declining reason1 "<Decreason1>" Then Declining reason2 "<Decreason2>" Then Declining reason3 "<Decreason3>" for the states "<State>" for "<S.No>"
	 			 Then enter Declining reason other1 "<DecliningReasonOther1>" Then Declining reason other2 "<DecliningReasonOther2>" Then Declining reason other3 "<DecliningReasonOther3>" for the state "<State>" for "<S.No>"
	 			 Then enter the Declining month1 "<Decliningmonth1>" Then Declining month2 "<Decliningmonth2>" Then Declining month3 "<Decliningmonth3>" for the state "<State>" for "<S.No>"
	 			 Then enter the Declining year1 "<Decliningyear1>" Then Declining year2 "<Decliningyear2>" Then Declining year3 "<Decliningyear3>" for the state "<State>" for "<S.No>"
	 			 Then enter Naic1 "<Naic1>" Then Naic2 "<Naic2>" Then Naic3 "<Naic3>" for the state "<State>" for "<S.No>"
	 			 Then enter PhoneNumber1 "<PhoneNumber1>" Then PhoneNumber2 "<PhoneNumber2>" Then PhoneNumber3 "<PhoneNumber3>" for the states "<State>" for "<S.No>"
	 			 Then enter DecliningReasonDEFL1 "<DecliningReasonDEFL1>" Then DecliningReasonDEFL2 "<DecliningReasonDEFL2>" Then DecliningReasonDEFL3 "<DecliningReasonDEFL3>" for the states "<State>" for "<S.No>")
	 			 Then enter RepType1 "<RepType1>" Then RepType2 "<RepType2>" Then RepType3 "<RepType3>" for the state "<State>" for "<S.No>"
	 			 Then enter OHInsurer1 "<OHInsurer1>" Then OHInsurer2 "<OHInsurer1>" Then OHInsurer3 "<OHInsurer3>" Then OHInsurer4 "<OHInsurer4>" Then OHInsurer5 "<OHInsurer5>" for the state "<State>" for "<S.No>"
	 			 Then enter OHReasons1 "<OHReasons1>" Then OHReasons2 "<OHReasons2>" Then OHReasons3 "<OHReasons3>" Then OHReasons4 "<OHReasons4>" Then OHReasons5 "<OHReasons5>" for the state "<State>" for "<S.No>"
	 			 Then enter CTAgencyLicense "<CTAgencyLicense>" Then CTAgentLicense "<CTAgentLicense>" for the state "<State>" for "<S.No>"
	 			 Then select the Resultcode1 "<Resultcode1>" Then Resultcode2 "<Resultcode2>" Then Resultcode3 "<Resultcode3>" for the state "<State>" for "<S.No>"
	 			 Then enter Diligentsearch1 "<Diligentsearch1>" Then Diligentsearch2 "<Diligentsearch2>" Then Diligentsearch3 "<Diligentsearch3>" for the state "<State>" for "<S.No>"
	 			 Then enter Diligent Searcher Name "<Diligentsearchername>" Then Diligent Searcher Title "<Diligentsearchertitle>" for the states "<State>" for "<S.No>"
	 			 Then enter Diligent Individual name "<DiligentIndividualName>" for the states "<State>" for "<S.No>"
	 			 Then enter Diligent Agency License number "<DiligentAgencyLicenseNumber>" for the states "<State>" for "<S.No>"
	 			 Then enter Diligent License number "<DiligentLicenseNumber>" for the states "<State>" for "<S.No>"
	 			 Then enter Diligent License type "<DiligentLicenseType>" for the states "<State>" for "<S.No>"
	 			 Then save Declining data for the states "<State>" for "<S.No>"
	 			 Then offer quote for "<S.No>"
	 			 
	 			 
	  Examples:
	 | S.No 	|carrierName 					           |URL									          |Testdata	  | username             | password |agencyCode   | insuredName     | insuredMailingAddress                         |State	| phoneNumber |LLC	|LlcPrincipals	|LocationType      	|SameAsInsuredMailingAddress |LocationAddress                                 |WindTerritory|occupancyType                                                   |NumberOfUnits |StructuresRentedToOthers | ProtectionClass| NumberOfStories |NumberOfStoriesCondo |CondoUnit   | ConstructionType |CladdingType  |Sq_Feet |YearBuilt |OverrideDTC  |UnitOfMeasurement	 |DistanceToCoast | HeatingType | HeatingTypeYearOfUpdate | PlumbingType | PlumbingTypeYearOfUpdate | RoofCovering         |RoofCoveringYearOfUpdate | ElectricType                          | ElectricTypeYearOfUpdate |RoofShape| Fasteners | GuttersPresent	  |WindRating   | SecondaryWaterResistance | KnobTubeAluminium    |RoofHaveParapets|RoofBracedOrUnbraced | SlopeOfRoof |RoofAnchor |OpeningProtection               |ProtectionSizeMissiles| Alarm			               | FullInteriorSprinklerSystem | NoOfLosses   | DateOfLoss1	| TypeOfLoss1| DescriptionOfLoss1| OpenClosed1 | AmountPaid1 |InsuranceCompany1  |DateOfLoss2  	| TypeOfLoss2   | DescriptionOfLoss2  | OpenClosed2 | AmountPaid2   |InsuranceCompany2  |DateOfLoss3	  | TypeOfLoss3   | DescriptionOfLoss3  | OpenClosed3 | AmountPaid3   |InsuranceCompany3  |DateOfLoss4	  | TypeOfLoss4   | DescriptionOfLoss4  | OpenClosed4 | AmountPaid4   |InsuranceCompany4  |DateOfLoss5	  | TypeOfLoss5   | DescriptionOfLoss5  | OpenClosed5 | AmountPaid5   |InsuranceCompany5  | BusinessChildcare		|DescBusinessActivities | AnyEmployees    | DaycareAttendingChildren    |SwimmingPool  |FullyFenced                  |AnimalBite     |TrustEstate   |NationalRegisterHistoric  |ToursConducted  | HighProfileIndividual | LocationInPast   |LocationIsWas   												    |PurchasePriceBR        | DateOfPurchaseBR    | TypeOfRenovation                  | CostOfRenovations |ConstructionBegun  |EstimatedCompletionDate     |RenovationWithin3months   |RenovationsCompletedBR    | EntityOwned     | LicensedContracter    | LockedFencedBoardedBR   | IntentionForProperty      |PurchasedLast12months |PurchasePriceVacant |DateOfPurchaseVacant	|LocationBecameVacant	  |RenovationsCompleted				|LockedFencedBoardedVacant			|PlanToOccupy				|AdditionalInterestType		|AdditionalInterestName				|effectiveDate	  |policyTerm				|billingType			|quoteType				|LossSettlementDwelling			|CoverageA			|policyForm			|CoverageB			|CoverageC			|CoverageD			|LossSettlementContents					|AllOtherPerilsDeductible					|WindDeductible		|DwellingExtendedReplacementCost			|WaterBackup							|OrdinanceOrLawCoverage			|VandalismAndMaliciousMischief			|TheftCoverage				|LimitedMoldCoverage			|IdentityFraud				|GreenUpgradesCoverage			|GolfCartCollisionCoverage				|PersonalLiability						|MedicalPaymentstoOthers   |PersonalInjuryCoverage	|PremisesCoverageforOwners	|EarthquakeCoverage		| Decliningcarrier1 |Decliningcarrier2 |Decliningcarrier3 |Datedeclined1 |Datedeclined2 |Datedeclined3 |Carrierrep1   |Carrierrep2   |Carrierrep3   |Decreason1 |Decreason2 |Decreason3 |DecliningReasonOther1 |DecliningReasonOther2 |DecliningReasonOther3 |Decliningmonth1 |Decliningmonth2 |Decliningmonth3 |Decliningyear1 |Decliningyear2 |Decliningyear3 |Naic1     |Naic2     |Naic3     |PhoneNumber1 |PhoneNumber2 |PhoneNumber3 |DecliningReasonDEFL1 |DecliningReasonDEFL2 |DecliningReasonDEFL3 |RepType1 |RepType2 |RepType3 |OHInsurer1  |OHInsurer2  |OHInsurer3  |OHInsurer4  |OHInsurer5  |OHReasons1 |OHReasons2 |OHReasons3 |OHReasons4 |OHReasons5 |CTAgencyLicense |CTAgentLicense |Resultcode1        |Resultcode2     |Resultcode3          |Diligentsearch1 |Diligentsearch2 |Diligentsearch3 |Diligentsearchername  |Diligentsearchertitle  |DiligentIndividualName |DiligentAgencyLicenseNumber |DiligentLicenseNumber |DiligentLicenseType        |  
	 | 1		|Certain Underwriters at Lloyds,London     |https://plqa.uat.solartis.net/plweb           |Testdata1  | allrisksunderwriter  | welcome1 |450076       | Cucumber01      | 514 Pennsylvania Ave, Baltimore, MD 21201, USA|MD		| 1234567891  |Yes	|test			|Homeowner/Dwelling |Yes                         |100 Main Street, MELFA, VA 23410, United States |No           |Owner - Primary Residence                                       |Duplex        |Yes                      | 3			   | 3               |23				   |7			| Masonry          |Brick Veneer  |2300    |2010      |Yes		    |In Miles            |75			  | Oil         | 2015                    | PEX          | 2015                     | Architectural Shingle|2015                     | Circuit Breaker (Greater than 100 amp)| 2015                     |Flat Roof|           |                   |Up to 110 mph| No					   | No					  |No	           |	                 |			   |Clips	   |Only glass opening are protected|Large                 | Central Station Fire Alarm    | Yes                         | 1            | 01/01/2017    | Property   | test              | Open        | 1600        |Abc                |             	|               |                     |             |               |                   |              	  |               |                     |             |               |                   |               |               |                     |             |               |                   |               |               |                     |             |               |                   | Yes             	    |Childcare              | No              | N/A                         |Yes           |Yes, fully fenced            |No			 |No			|Yes                       |No              | Yes                   | Yes              |Purchased within the last 12 months (includes future purchase date) |1000                   | 12/12/2018          | Heavy Renovations (Structural)    | 2000              |No                 |12/12/2018	               |Yes					      |No                        | No              | No                    | Yes                     | Flip/Sell the property	 |No    				|2500				 |12/12/2018			|12/12/2018				  |No 								|No									|No							|Mortgagee					|Test Mortgagee						|05/05/2018       |12 months				|Direct Bill  			|New Business			|RCV							|350000				|HO3	            |25000				|35000				|35000				|Replacement Cost						|$1,000										|None 				|No						                    |$5,000									|								|									    |							|$5,000						    |Yes						|								|										|$500,000								|$10,000				   |						|							|						| Insurer 1         |Insurer 2         |Insurer 3         |01/01/2018    |01/01/2018    |01/01/2018	   |Carrier Rep 1 |Carrier Rep 2 |Carrier Rep 3	|Other      |Other      |Other      |Description 1         |Description 2         |Description 3         |01              |01              |01              |2017           |2017           |2017           |123456789 |123456789 |123456789 |123456789    |123456789    |123456789    |TEST                 |TEST                 |TEST                 |Employee |Agent    |Employee |OH Insurer 1|OH Insurer 2|OH Insurer 3|OH Insurer 4|OH Insurer 5|OH Reason 1|OH Reason 2|OH Reason 3|OH Reason 4|OH Reason 5|123456789       |123456789      |Unfavorable Premium|Carrier Declined|Coverage Restrictions|Search effort 1 |Search effort 2 |Search effort 3 |Diligent Searcher Name|Diligent Searcher Title|Full Name              |123123                      |321321                |Duly Licensed as Individual|
	#| 2		|Certain Underwriters at Lloyds,London     |https://plqa.uat.solartis.net/plweb		      |Testdata2  | allrisksunderwriter  | welcome1 |450076       | Cucumber02      | 100 Main St, Preston, MD 21655, USA           |MD     | 1234567891  |Yes	|test			|Homeowner/Dwelling |Yes                         |100 Main Street, MELFA, VA 23410, United States |Yes          |Builders Risk (Structural Renovations & Ground Up Construction) |Duplex        |Yes                      | 3			   | 3               |	                   |            |Masonry           |Brick Veneer  |2300    |2010      |Yes		    |In Miles            |75			  | Oil         | 2015                    | PEX          | 2015                     | Architectural Shingle|2015                     | Circuit Breaker (Greater than 100 amp)| 2015                     |Flat Roof|           |                   |Up to 110 mph| No					   | No					  |No	           |	                 |			   |Clips	   |Only glass opening are protected|Large                 | Central Station Fire Alarm    | Yes                         | 2            | 01/01/2017    | Property   | test              | Open        | 1600        |Abc                | 01/01/2017   | Property      |test                 | Closed      | 2300          | Def               |              	  |               |                     |             |               |                   |               |               |                     |             |               |                   |               |               |                     |             |               |                   | Yes             	    |Childcare              | No              | N/A                         |Yes           |Yes, fully fenced            |No		     |No			|Yes                       |No              | Yes                   | Yes              |Purchased within the last 12 months (includes future purchase date) |1000                   | 12/12/2018          | Heavy Renovations (Structural)    | 2000              |No                 |12/12/2018	               |Yes					      |No                        | No              | No                    | Yes                     | Flip/Sell the property    |No    				|2500				 |12/12/2018			|12/12/2018				  |No 								|No									|No							|Mortgagee					|Test Mortgagee						|05/05/2018       |12 months				|Direct Bill  			|New Business			|RCV							|350000				|Builders Risk DP3  |25000				|35000				|35000				|Replacement Cost						|$2,500										|4% 				|						                    |										|		                        |										|$5000						|$10,000						|							|								|										|										|						   |						|$300,000					|						| Insurer 1         |Insurer 2         |Insurer 3         |01/01/2018    |01/01/2018    |01/01/2018	   |Carrier Rep 1 |Carrier Rep 2 |Carrier Rep 3	|Other      |Other      |Other      |Description 1         |Description 2         |Description 3         |01              |01              |01              |2017           |2017           |2017           |123456789 |123456789 |123456789 |123456789    |123456789    |123456789    |TEST                 |TEST                 |TEST                 |Employee |Agent    |Employee |OH Insurer 1|OH Insurer 2|OH Insurer 3|OH Insurer 4|OH Insurer 5|OH Reason 1|OH Reason 2|OH Reason 3|OH Reason 4|OH Reason 5|123456789       |123456789      |Unfavorable Premium|Carrier Declined|Coverage Restrictions|Search effort 1 |Search effort 2 |Search effort 3 |Diligent Searcher Name|Diligent Searcher Title|Full Name              |123123                      |321321                |Duly Licensed as Individual|		 
	#| 3		|Certain Underwriters at Lloyds,London     |https://plqa.uat.solartis.net/plweb		      |Testdata3  | allrisksunderwriter  | welcome1 |450076       | Cucumber03      | 100 Main St, Preston, MD 21655, USA           |MD     | 1234567891  |Yes	|test			|Homeowner/Dwelling |Yes                         |100 Main Street, MELFA, VA 23410, United States |Yes          |Vacant (including cosmetic/non-structural renovations)          |Duplex        |Yes                      | 3			   | 3               |	                   |            |Masonry           |Brick Veneer  |2300    |2010      |Yes		    |In Miles            |75			  | Oil         | 2015                    | PEX          | 2015                     | Architectural Shingle|2015                     | Circuit Breaker (Greater than 100 amp)| 2015                     |Flat Roof|           |                   |Up to 110 mph| No					   | No					  |No	           |	                 |			   |Clips	   |Only glass opening are protected|Large                 | Central Station Fire Alarm    | Yes                         | 0            | 01/01/2017    | Property   | test              | Open        | 1600        |Abc                | 01/01/2017   | Property      |test                 | Closed      | 2300          | Def               |              	  |               |                     |             |               |                   |               |               |                     |             |               |                   |               |               |                     |             |               |                   | Yes             	    |Childcare              | No              | N/A                         |Yes           |Yes, fully fenced            |No		     |No			|Yes                       |No              | Yes                   | Yes              |Purchased within the last 12 months (includes future purchase date) |1000                   | 12/12/2018          | Heavy Renovations (Structural)    | 2000              |No                 |12/12/2018	               |Yes					      |No                        | No              | No                    | Yes                     | Flip/Sell the property    |Yes    				|2500				 |12/12/2017			|10/07/2017				  |No 								|No									|Yes						|Mortgagee					|Test Mortgagee						|05/05/2018       |6 months				    |Direct Bill  			|New Business			|RCV							|350000				|Vacant - DP3       |25000				|35000				|35000				|Replacement Cost						|$10,000									|4% 				|						                    |										|		                        |Included								|$5000						|$15,000						|							|								|										|										|						   |						|$100,000					|						| Insurer 1         |Insurer 2         |Insurer 3         |01/01/2018    |01/01/2018    |01/01/2018	   |Carrier Rep 1 |Carrier Rep 2 |Carrier Rep 3	|Other      |Other      |Other      |Description 1         |Description 2         |Description 3         |01              |01              |01              |2017           |2017           |2017           |123456789 |123456789 |123456789 |123456789    |123456789    |123456789    |TEST                 |TEST                 |TEST                 |Employee |Agent    |Employee |OH Insurer 1|OH Insurer 2|OH Insurer 3|OH Insurer 4|OH Insurer 5|OH Reason 1|OH Reason 2|OH Reason 3|OH Reason 4|OH Reason 5|123456789       |123456789      |Unfavorable Premium|Carrier Declined|Coverage Restrictions|Search effort 1 |Search effort 2 |Search effort 3 |Diligent Searcher Name|Diligent Searcher Title|Full Name              |123123                      |321321                |Duly Licensed as Individual|
	 