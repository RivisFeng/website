/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 03/06/2018 21:12:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `user_name` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名（AES加密）',
  `user_password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户密码（SHA不可逆加密）',
  `user_picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户头像（AES加密）',
  `user_birthday` datetime(0) NOT NULL COMMENT '用户生日',
  `user_gender` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户性别 0：女人 1：男人（AES加密）',
  `user_phone` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户手机（AES加密）',
  `user_city_id` bigint(18) NOT NULL COMMENT '用户所在城市ID',
  `user_address` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户详细住址（AES加密）',
  `user_is_delete` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户是否注销 0:已经注销 1:未注销（AES加密）',
  `user_is_vip` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户是否是VIP 0:不是 1:是（AES加密）',
  `user_mail` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户电子邮箱（AES加密）',
  `user_create_time` datetime(0) NOT NULL COMMENT '用户注册时间',
  `user_from` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户来源 0：管理员从数据库中手动添加 1：平台自主注册 2：业务员开发 3：微博 4：微信 5：QQ 6：贴吧 7：淘宝（AES加密）',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (450395793623351296, 'HUkGOakkZ/P5uY1NxvMUBA==', 'b052f5271520aa3c1c6f6eb58ee60244c11e9a041adfe8eb2c7a724f84bc9ff9', 'https://image.baidu.com/search/index', '2018-06-18 00:00:00', 'CZbTiQP4Znhgc2UCchxkVQ==', 'rsuIT4qRskID3wXwxYX3aw==', 450348527793471488, 'QG+TvsBOjqKSl2oT8yxnpA==', 'CZbTiQP4Znhgc2UCchxkVQ==', 'q/8u/PKPRgzCK1h2cYfuPg==', '/dqR1EY7CF+4XffXNU2kWRkct4AqkTngIbThhr0Dz9w=', '2018-05-27 20:32:05', 'q/8u/PKPRgzCK1h2cYfuPg==');

SET FOREIGN_KEY_CHECKS = 1;
