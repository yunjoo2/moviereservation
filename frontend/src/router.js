
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MovieMovieManager from "./components/listers/MovieMovieCards"
import MovieMovieDetail from "./components/listers/MovieMovieDetail"

import MyinfoMyinfoManager from "./components/listers/MyinfoMyinfoCards"
import MyinfoMyinfoDetail from "./components/listers/MyinfoMyinfoDetail"

import ReservationReservationManager from "./components/listers/ReservationReservationCards"
import ReservationReservationDetail from "./components/listers/ReservationReservationDetail"

import PointPointManager from "./components/listers/PointPointCards"
import PointPointDetail from "./components/listers/PointPointDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/movies/movies',
                name: 'MovieMovieManager',
                component: MovieMovieManager
            },
            {
                path: '/movies/movies/:id',
                name: 'MovieMovieDetail',
                component: MovieMovieDetail
            },

            {
                path: '/myinfos/myinfos',
                name: 'MyinfoMyinfoManager',
                component: MyinfoMyinfoManager
            },
            {
                path: '/myinfos/myinfos/:id',
                name: 'MyinfoMyinfoDetail',
                component: MyinfoMyinfoDetail
            },

            {
                path: '/reservations/reservations',
                name: 'ReservationReservationManager',
                component: ReservationReservationManager
            },
            {
                path: '/reservations/reservations/:id',
                name: 'ReservationReservationDetail',
                component: ReservationReservationDetail
            },

            {
                path: '/points/points',
                name: 'PointPointManager',
                component: PointPointManager
            },
            {
                path: '/points/points/:id',
                name: 'PointPointDetail',
                component: PointPointDetail
            },



    ]
})
