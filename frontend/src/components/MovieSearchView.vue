<template>

    <v-data-table
        :headers="headers"
        :items="movieSearch"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MovieSearchView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            movieSearch : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/movieSearches'))

            temp.data._embedded.movieSearches.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.movieSearch = temp.data._embedded.movieSearches;
        },
        methods: {
        }
    }
</script>

