package uvsoftgroupgrails3restfulapiapp2
import grails.rest.Resource

@Resource(uri = '/buildingInfos')
class BuildingInfo {
	Long buId,buAddressId,buPlId
	String buCode,buName,buUseType,buRemark
	BigDecimal buNumberOfFloor,buTotalHeight,buNumberOfFloorUnit,buTotalGroundArea,buTotalFloorArea,buSetBackFront,
	buSetBackBack,buSetBackRight,buSetBackLeft,buCenterLongitude,buCenterLatitude
	byte [] buLayoutPicture

	static belongsTo =[plotInfo:PlotInfo]
	static constraints = {
		buId()
		buAddressId()
		buPlId()
		buCode()
		buName()
		buUseType()
		buNumberOfFloor(scale: 3, maxSize:10)
		buTotalHeight()
		buNumberOfFloorUnit()
		buTotalGroundArea()
		buTotalFloorArea()
		buSetBackFront()
		buSetBackBack()
		buSetBackRight()
		buSetBackLeft()
		buCenterLongitude()
		buCenterLatitude()
		buLayoutPicture()
		buRemark()
	}
	String toString() { "${buId}-${buUseType}" }
	static mapping = {
		table 'buildingInfo'
		version false
		columns {
			buId column:'bu_id'
			buAddressId column:'bu_ad_id'
			buPlId column:'bu_pl_id'
			buCode column:'bu_code'
			buName (column:'bu_name',nullable:true, blank:true)
			buUseType column:'bu_use_type'
			buNumberOfFloor column:'bu_fl_number'
			buTotalHeight column:'bu_tot_height'
			buNumberOfFloorUnit column:'bu_fl_un_num'
			buTotalGroundArea column:'bu_tga'
			buTotalFloorArea column:'bu_tfa'
			buSetBackFront column:'bu_set_bf'
			buSetBackBack column:'bu_set_bb'
			buSetBackRight column:'bu_set_br'
			buSetBackLeft column:'bu_set_bl'
			buCenterLongitude column:'bu_ce_longitude'
			buCenterLatitude column:'bu_ce_latitude'
			buLayoutPicture column:'bu_layout_pic'
			buRemark column:'bu_remark'

		}
	}
}
